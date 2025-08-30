package modelo;

import java.util.*;

public class ArbolVotacion {
    private Nodo raiz;

    public ArbolVotacion() {
        raiz = null;
    }

    // Getter para la raíz (para el PanelArbol)
    public Nodo getRaiz() {
        return raiz;
    }

    // Insertar un nodo
    public void insertar(String doc, String nom, String ape, String voto) {
        raiz = insertarRec(raiz, doc, nom, ape, voto);
    }

    private Nodo insertarRec(Nodo actual, String doc, String nom, String ape, String voto) {
        if (actual == null) {
            return new Nodo(doc, nom, ape, voto);
        }
        if (doc.compareTo(actual.getDocumento()) < 0) {
            actual.izquierda = insertarRec(actual.izquierda, doc, nom, ape, voto);
        } else if (doc.compareTo(actual.getDocumento()) > 0) {
            actual.derecha = insertarRec(actual.derecha, doc, nom, ape, voto);
        }
        return actual;
    }

    // Buscar nodo
    public Nodo buscar(String doc) {
        return buscarRec(raiz, doc);
    }

    private Nodo buscarRec(Nodo actual, String doc) {
        if (actual == null || actual.getDocumento().equals(doc)) return actual;
        return doc.compareTo(actual.getDocumento()) < 0 ?
               buscarRec(actual.izquierda, doc) :
               buscarRec(actual.derecha, doc);
    }

    // Eliminar nodo
    public void eliminar(String doc) {
        raiz = eliminarRec(raiz, doc);
    }

    private Nodo eliminarRec(Nodo actual, String doc) {
        if (actual == null) return null;

        if (doc.compareTo(actual.getDocumento()) < 0) {
            actual.izquierda = eliminarRec(actual.izquierda, doc);
        } else if (doc.compareTo(actual.getDocumento()) > 0) {
            actual.derecha = eliminarRec(actual.derecha, doc);
        } else {
            // Caso 1: sin hijos
            if (actual.izquierda == null && actual.derecha == null) return null;
            // Caso 2: un hijo
            if (actual.izquierda == null) return actual.derecha;
            if (actual.derecha == null) return actual.izquierda;
            // Caso 3: dos hijos → buscar sucesor
            Nodo sucesor = minimo(actual.derecha);
            actual = new Nodo(sucesor.getDocumento(), sucesor.getNombre(), sucesor.getApellido(), sucesor.getVoto());
            actual.derecha = eliminarRec(actual.derecha, sucesor.getDocumento());
        }
        return actual;
    }

    private Nodo minimo(Nodo nodo) {
        while (nodo.izquierda != null) nodo = nodo.izquierda;
        return nodo;
    }

    // Recorridos
    public List<Nodo> inOrden() {
        List<Nodo> lista = new ArrayList<>();
        inOrdenRec(raiz, lista);
        return lista;
    }
    private void inOrdenRec(Nodo actual, List<Nodo> lista) {
        if (actual != null) {
            inOrdenRec(actual.izquierda, lista);
            lista.add(actual);
            inOrdenRec(actual.derecha, lista);
        }
    }

    public List<Nodo> preOrden() {
        List<Nodo> lista = new ArrayList<>();
        preOrdenRec(raiz, lista);
        return lista;
    }
    private void preOrdenRec(Nodo actual, List<Nodo> lista) {
        if (actual != null) {
            lista.add(actual);
            preOrdenRec(actual.izquierda, lista);
            preOrdenRec(actual.derecha, lista);
        }
    }

    public List<Nodo> postOrden() {
        List<Nodo> lista = new ArrayList<>();
        postOrdenRec(raiz, lista);
        return lista;
    }
    private void postOrdenRec(Nodo actual, List<Nodo> lista) {
        if (actual != null) {
            postOrdenRec(actual.izquierda, lista);
            postOrdenRec(actual.derecha, lista);
            lista.add(actual);
        }
    }

    public List<Nodo> porNiveles() {
        List<Nodo> lista = new ArrayList<>();
        if (raiz == null) return lista;
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            lista.add(actual);
            if (actual.izquierda != null) cola.add(actual.izquierda);
            if (actual.derecha != null) cola.add(actual.derecha);
        }
        return lista;
    }

    // Contar nodos
    public int contar() {
        return contarRec(raiz);
    }
    private int contarRec(Nodo actual) {
        if (actual == null) return 0;
        return 1 + contarRec(actual.izquierda) + contarRec(actual.derecha);
    }

    // Altura
    public int altura() {
        return alturaRec(raiz);
    }
    private int alturaRec(Nodo actual) {
        if (actual == null) return 0;
        return 1 + Math.max(alturaRec(actual.izquierda), alturaRec(actual.derecha));
    }

    // Hojas
    public int contarHojas() {
        return contarHojasRec(raiz);
    }
    private int contarHojasRec(Nodo actual) {
        if (actual == null) return 0;
        if (actual.izquierda == null && actual.derecha == null) return 1;
        return contarHojasRec(actual.izquierda) + contarHojasRec(actual.derecha);
    }

    // Nodos internos
    public int contarInternos() {
        return contarInternosRec(raiz);
    }
    private int contarInternosRec(Nodo actual) {
        if (actual == null || (actual.izquierda == null && actual.derecha == null)) return 0;
        return 1 + contarInternosRec(actual.izquierda) + contarInternosRec(actual.derecha);
    }

    // Balanceado
    public boolean estaBalanceado() {
        return balanceadoRec(raiz) != -1;
    }
    private int balanceadoRec(Nodo actual) {
        if (actual == null) return 0;
        int izq = balanceadoRec(actual.izquierda);
        if (izq == -1) return -1;
        int der = balanceadoRec(actual.derecha);
        if (der == -1) return -1;
        if (Math.abs(izq - der) > 1) return -1;
        return 1 + Math.max(izq, der);
    }
}
