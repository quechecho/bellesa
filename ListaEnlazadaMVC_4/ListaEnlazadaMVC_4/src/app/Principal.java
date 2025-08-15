package app;

import admonLista.Lista;
import controlador.Controlador;
import modelo.Libro;
import modelo.Validar;
import vista.Vista;

public class Principal {
    public static void main(String[] args) {
        Lista lis       = new Lista();
        Libro lib       = new Libro();
        Vista vis       = new Vista();
        Validar val     = new Validar();
        Controlador co  = new Controlador(lis, lib, vis, val);
        co.Iniciar();
        co.deshabilitarBtn();
        vis.setVisible(true);
    }
}
