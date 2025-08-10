package admonPila;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.estudiantes;
import view.VistaPila;

public class AdmonPila {

    
    public Stack<estudiantes> pila;
    
    DecimalFormat f1 = new DecimalFormat("###,###,###.##");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");
    
    String cabecera[] = {"Identificación", "Nombres", "Apellidos", "Valor Matrícula", "Promedio",};
    String datos[][] = {};
    DefaultTableModel modelo1 = new DefaultTableModel(datos, cabecera);

    
    public AdmonPila(VistaPila visPil) {
        visPil.getTblestudiante().setModel(modelo1);
    }

    public Stack<estudiantes> getPila() {
        return pila;
    }

    
    public void crearPila() {
        pila = new Stack<>();
    }

    public void adicionar(estudiantes per) {
        pila.push(per);
        JOptionPane.showMessageDialog(null, "Estudiante adicionado a la pila");
    }

    public void recorrerPila() {
        if (!pila.isEmpty()) {
            modelo1.setRowCount(0);
            // Recorrer desde el tope hacia abajo (LIFO)
            for (int i = pila.size() - 1; i >= 0; i--) {
                estudiantes p = pila.get(i);              
                Object contenido[] = {
                    p.getIdeEst(),
                    p.getNomEst(),
                    p.getApeEst(),
                    f3.format(p.getValMatSem()),
                    f1.format(p.getProSem()),
                };
                modelo1.addRow(contenido);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
    }

    public void primero() {
        if (!pila.isEmpty()) {
            modelo1.setRowCount(0);
            estudiantes p = pila.peek(); // El tope de la pila
            Object contenido[] = {
                p.getIdeEst(),
                p.getNomEst(),
                p.getApeEst(),
                f3.format(p.getValMatSem()),
                f1.format(p.getProSem()),   
            };
            modelo1.addRow(contenido);
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
    }

    public void eliminar() {
        modelo1.setRowCount(0);
        if (!pila.isEmpty()) {
            estudiantes p = pila.pop(); // Elimina del tope
            JOptionPane.showMessageDialog(null, "Estudiante eliminado de la pila: " + p.getNomEst() + " " + p.getApeEst());
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        }
    }    
   
    public estudiantes buscarPorIdentificacion(String ideEst) {
        for (estudiantes est : pila) {
            if (est.getIdeEst().equals(ideEst)) {
                return est;
            }
        }
        return null;
    }
    
    public ArrayList<estudiantes> buscarPorApellido(String apellido) {
        ArrayList<estudiantes> resultado = new ArrayList<>();
        for (estudiantes est : pila) {
            if (est.getApeEst().equalsIgnoreCase(apellido)) {
                resultado.add(est);
            }
        }
        return resultado;
    }
    
    public ArrayList<estudiantes> buscarPorNombre(String nombre) {
        ArrayList<estudiantes> resultado = new ArrayList<>();
        for (estudiantes est : pila) {
            if (est.getNomEst().equalsIgnoreCase(nombre)) {
                resultado.add(est);
            }
        }
        return resultado;
    }
    
  
    public ArrayList<estudiantes> buscarPorPromedio(float promedio) {
        ArrayList<estudiantes> resultado = new ArrayList<>();
        for (estudiantes est : pila) {
            if (est.getProSem() == promedio) {
                resultado.add(est);
            }
        }
        return resultado;
    }
    
  
    public ArrayList<estudiantes> buscarPorValorMatricula(float valorMatricula) {
        ArrayList<estudiantes> resultado = new ArrayList<>();
        for (estudiantes est : pila) {
            if (est.getValMatSem() == valorMatricula) {
                resultado.add(est);
            }
        }
        return resultado;
    }
    
  
    public void mostrarResultadosBusqueda(ArrayList<estudiantes> resultados) {
        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontraron resultados");
            return;
        }
        
        modelo1.setRowCount(0);
        for (estudiantes p : resultados) {
            
            Object contenido[] = {
                p.getIdeEst(),
                p.getNomEst(),
                p.getApeEst(),
                f3.format(p.getValMatSem()),
                f1.format(p.getProSem()),            
            };
            modelo1.addRow(contenido);
        }
    }
    
   
    public int getTamanoPila() {
        return pila.size();
    }
}