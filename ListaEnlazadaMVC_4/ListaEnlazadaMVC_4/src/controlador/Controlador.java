package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Libro;
import vista.Vista;
import admonLista.Lista;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import modelo.Validar;

public class Controlador implements ActionListener {

    //Atributos de la clase
    private final Lista lis;
    private Libro lib;
    private final Vista vis;
    private final Validar val;
    
    
    public DefaultTableModel modelo;

    //Variables auxiliares
    String tit, aut, isb, cad;
    int nro;

    //Constructor
    public Controlador(Lista lis, Libro lib, Vista vis, Validar val) {
        this.lis = lis;
        this.lib = lib;
        this.vis = vis;
        this.val = val;

        //Adicionar los botones
        this.vis.getBtnValidar().addActionListener(e -> {
            btnValidar();
        });
        this.vis.getBtnAddInicio().addActionListener(e -> {
            btnAddInicio();
        });
        this.vis.getBtnAddFinal().addActionListener(e -> {
            btnAddFinal();
        });
        this.vis.getBtnAddDespues().addActionListener(e -> {
            btnAddDespues();
        });
        this.vis.getBtnDelInicio().addActionListener(e -> {
            btnDelInicio();
        });
        this.vis.getBtnDelFinal().addActionListener(e -> {
            btnDelFinal();
        });
        this.vis.getBtnDelDespues().addActionListener(e -> {
            btnDelDespues();
        });
        this.vis.getBtnObtener().addActionListener(e -> {
            btnObtener();
        });
        this.vis.getBtnContar().addActionListener(e -> {
            btnContar();
        });
        this.vis.getBtnTodos().addActionListener(e -> {
            btnTodos();
        });
        this.vis.getBtnLimpiar().addActionListener(e -> {
            btnLimpiar();
        });
        this.vis.getBtnSalir().addActionListener(e -> {
            System.exit(0);
        });

        //Asignar cabecera y valores a la tabla 
        String cabecera[] = {"Título", "Autor", "ISBN"};
        String datos[][] = {};
        modelo = new DefaultTableModel(datos, cabecera);
        vis.getTblDatos().setModel(modelo);
    }

    //Colocar título al formulario
    public void Iniciar() {
        vis.setTitle("lista enlazada");
        vis.setLocationRelativeTo(null);
    }

    public void btnValidar() {
        if(val.validarCadena(vis.getTxtTitulo().getText())){
            tit = vis.getTxtTitulo().getText().trim();
            
            if(val.validarCadena(vis.getTxtAutor().getText())){
                aut = vis.getTxtAutor().getText();
                
                if(val.validarIsbn(vis.getTxtIsbn().getText())){
                    isb = vis.getTxtIsbn().getText();
                    
                    lib = new Libro(tit, aut, isb);
                     habilitarBtn();
                }else{
                    error(vis.getTxtIsbn(), "Error en el campo ISBN, su contenido no es válido");
                }
            }else{
                error(vis.getTxtAutor(), "Error en el campo autor, su contenido no es válido");
            }
        }else {
            error(vis.getTxtTitulo(), "Error en el campo título, su contenido no es válido");
        }
    }

    public boolean DatoNodo() {
        String nodo = vis.getTxtNro().getText();
        nodo = nodo.trim();
        return !nodo.isEmpty();
    }
    
    public void btnAddInicio() {
        lib = new Libro(tit, aut, isb);
        lis.InsertarPrincipio(lib);
        insercion();
        btnLimpiar();
    }

    public void btnAddFinal() {
        lib = new Libro(tit, aut, isb);
        lis.InsertarFinal(lib);
        btnLimpiar();
    }

    public void btnAddDespues() {
        if (DatoNodo()) {
            nro = Integer.parseInt(vis.getTxtNro().getText());
            lib = new Libro(tit, aut, isb);
            lis.InsertarDespues(nro, lib);
            btnLimpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No se especificó la posición del nodo a adicionar...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void btnDelInicio() {
        if (lis.EliminarPrincipio()) {
            btnLimpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No existen nodos para eliminar...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void btnDelFinal() {
        if (lis.EliminarFinal()) {
            btnLimpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No existen nodos para eliminar...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void btnDelDespues() {
        if (DatoNodo()) {
            nro = Integer.parseInt(vis.getTxtNro().getText());
            if (lis.EliminarDespues(nro)) {
                btnLimpiar();
                JOptionPane.showMessageDialog(null, "Nodo eliminado...", "Notificación", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No existen ese nodos para eliminar...", "Notificación", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe especificar el nodos a eliminar en el campo Nodo Nro...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void btnObtener() {
        if (DatoNodo()) {
            nro = Integer.parseInt(vis.getTxtNro().getText());
            lib = lis.Obtener(nro);
            modelo.setRowCount(0);
            if (lib != null) {
                Object contenido[] = {lib.getTitulo(), lib.getAutor(), lib.getIsbn()};
                modelo.addRow(contenido);
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese nodo...", "Notificación", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Se debe indicar el número del nodo...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void btnContar() {
        nro = lis.Contar();

        if (nro != -99) {
            JOptionPane.showMessageDialog(null, "Número de nodos: " + String.valueOf(nro), "Notificación", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void btnTodos() {
        modelo.setRowCount(0);
        ArrayList<Libro> VecLib = new ArrayList<>();
        VecLib = lis.ObtenerTodos();
        for (Libro li : VecLib) {
            Object contenido[] = {li.getTitulo(), li.getAutor(), li.getIsbn()};
            modelo.addRow(contenido);
        }
    }

    public void btnLimpiar() {
        vis.getTxtTitulo().setText("");
        vis.getTxtAutor().setText("");
        vis.getTxtIsbn().setText("");
        vis.getTxtNro().setText("");
        modelo.setRowCount(0);
        deshabilitar();
        vis.getTxtTitulo().requestFocus();
        
    }
    
    //Método para mostrar un mensaje de error y limpiar el campo de texto y asignarle el focus
    public void error(javax.swing.JTextField txtName, String msg) {
        
        // Cambiar el color del texto del JOptionPane a rojo
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        txtName.setText("");
        txtName.requestFocus();
        
        // Resetear el color a su valor original (opcional)
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }
    
    public void insercion(){
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: green\">Nodo insertado correctamente... </p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void deshabilitarBtn(){
        vis.getBtnAddInicio().setEnabled(false);
        vis.getBtnAddFinal().setEnabled(false);
        vis.getBtnDelInicio().setEnabled(false);
        vis.getBtnDelFinal().setEnabled(false);
        vis.getBtnAddDespues().setEnabled(false);
        vis.getBtnDelDespues().setEnabled(false);
        vis.getBtnObtener().setEnabled(false);
        vis.getBtnContar().setEnabled(false);
        vis.getBtnTodos().setEnabled(false);
    }
    
    public void habilitarBtn(){
        vis.getBtnAddInicio().setEnabled(true);
        vis.getBtnAddFinal().setEnabled(true);
        vis.getBtnDelInicio().setEnabled(true);
        vis.getBtnDelFinal().setEnabled(true);
        vis.getBtnAddDespues().setEnabled(true);
        vis.getBtnDelDespues().setEnabled(true);
        vis.getBtnObtener().setEnabled(true);
        vis.getBtnContar().setEnabled(true);
        vis.getBtnTodos().setEnabled(true);
    }
    
    public void deshabilitar(){
        vis.getBtnAddInicio().setEnabled(false);
        vis.getBtnAddFinal().setEnabled(false);
        vis.getBtnAddDespues().setEnabled(false);
        vis.getBtnDelDespues().setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

