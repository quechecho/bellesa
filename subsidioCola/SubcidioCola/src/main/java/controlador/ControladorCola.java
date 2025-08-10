package controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import modelo.estudiantes;
import validar.Validar;
import view.SalidasPariales;
import view.Totales;
import view.VistaCola;

public class ControladorCola {

    private final estudiantes est;
    private final SalidasPariales salPar;
    private final Totales tot;
    private final VistaCola ent;
    private final Validar val;
    private final admonCola.AdmonCola admCol;
    
    //Ventana principal para mostrar las diferentes vistas
    private JFrame ventanaPrincipal;
    
    float porSubMat, valPagEst, valSubOng, valPagSub, dinTotSub100, dinTotSub80, dinTotSub60, dinTotSub40, dinTotSub20, dinTotSub;
    float porEstSub100, porEstSub80, porEstSub60, porEstSub40, porEstSub20, porEstSub00;
    int numEstSub100, numEstSub80, numEstSub60, numEstSub40, numEstSub20, numEstSub00, numTotEstSub, numTotEstAfi;
    
    //Formatos de salida 
    DecimalFormat f1 = new DecimalFormat("###,###,###.##");
    DecimalFormat f2 = new DecimalFormat("#########.#%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");
    
    //Asignar cabecera y valores a la tabla tblsalidaparcial del panel salidaparcial
    String cabecera[] = {"Ident.", "Apellidos", "Nombres", "Val. matSem", "% Sub.", "Val. sub.", "Val. PagEst"};
    String datos[][] = {};
    DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);
    
    public ControladorCola(estudiantes est, SalidasPariales salPar, Totales tot, Validar val, VistaCola ent) {
        this.est = est;
        this.salPar = salPar;
        this.tot = tot;
        this.ent = ent;
        this.val = val;
        this.admCol = new admonCola.AdmonCola(ent);
        
        
        this.ventanaPrincipal = new JFrame();
        
        this.ent.getBtnValidar().addActionListener(e -> {btnValidar();});
        this.ent.getBtnCalcular().addActionListener(e -> {btnCalcular();});
        this.ent.getBtnTotalizar().addActionListener(e -> {btnTotalizar();});
        
        this.ent.getBtnAdicionar().addActionListener(e -> {
            btnAdicionar();
        });
        this.ent.getBtnNuevo().addActionListener(e -> {
            btnNuevo();
        });
        this.ent.getBtnVer().addActionListener(e -> {
            btnVer();
        });
        this.ent.getBtnPrimero().addActionListener(e -> {
            btnPrimero();
        });
        
        this.ent.getBtnEliminar().addActionListener(e -> {
            btnEliminar();
        });
        
        this.ent.getBtnSalir().addActionListener(e -> {System.exit(0);});
        
        this.ent.getBtnBuscarIdeEst().addActionListener(e -> {btnBuscarIdeEst();});
        this.ent.getBtnBuscarapeEst().addActionListener(e -> {btnBuscarapeEst();});
        this.ent.getBtnBuscarnomEst().addActionListener(e -> {btnBuscarnomEst();});
        this.ent.getBtnBuscarproSem().addActionListener(e -> {btnBuscarproSem();});
        this.ent.getBtnBuscarvalmatSem().addActionListener(e -> {btnBuscarvalmatSem();});
        
     
        this.salPar.getBtnVolver().addActionListener(e -> {btnVolverACola();});
        this.tot.getBntVolver().addActionListener(e -> {btnVolverACola();});
       
        admCol.crearCola();
        

        salPar.getjTblaDatos().setModel(modelo);
       
        inicializarVentanaPrincipal();
    }
    
    
    private void inicializarVentanaPrincipal() {
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(740, 640);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setLayout(new BorderLayout());
        
        mostrarVistaCola();
    }
    
    private void mostrarVistaCola() {
        ventanaPrincipal.getContentPane().removeAll();
        ventanaPrincipal.getContentPane().add(ent.getContentPane(), BorderLayout.CENTER);
        ventanaPrincipal.revalidate();
        ventanaPrincipal.repaint();
        
        ent.getBtnCalcular().setEnabled(true); 
        ent.getBtnTotalizar().setEnabled(true);
        ent.getBtnBuscarIdeEst().setEnabled(true);
        ent.getBtnBuscarapeEst().setEnabled(true);
        ent.getBtnBuscarnomEst().setEnabled(true);
        ent.getBtnBuscarproSem().setEnabled(true);
        ent.getBtnBuscarvalmatSem().setEnabled(true);
    }
    
    private void btnValidar() {
        if(val.validarNumeroEnteroPositivo(ent.getTextideEst().getText())) {
            est.setIdeEst(ent.getTextideEst().getText());
            if (val.validarNombre(ent.getTextnomEst().getText())) {
                est.setNomEst(ent.getTextnomEst().getText());
                if (val.validarApellido(ent.getTextapeEst().getText())) {
                    est.setApeEst(ent.getTextapeEst().getText());
                    if (val.validarNumeroRealPositivo(ent.getTextproSem().getText())) {
                        est.setProSem(Float.parseFloat(ent.getTextproSem().getText()));
                        if(val.validarNumeroRealPositivo(ent.getTextvalMatSem().getText())) {
                            est.setValMatSem(Float.parseFloat(ent.getTextvalMatSem().getText()));
                            ent.getBtnCalcular().setEnabled(true); 
                            ent.getBtnTotalizar().setEnabled(true);
                            JOptionPane.showMessageDialog(null, "Datos validados correctamente");
                        } else {
                            error(ent.getTextvalMatSem(),"Error en el campo valor de matricula, su contenido no es válido");
                        }
                    } else {
                        error(ent.getTextproSem(),"Error en el campo promedio de semestre, su contenido no es válido");
                    }
                } else {
                    error(ent.getTextapeEst(),"Error en el campo apellido, su contenido no es válido");
                }
            } else {
                error(ent.getTextnomEst(),"Error en el campo nombre, su contenido no es válido");
            }
        } else {
            error(ent.getTextideEst(),"Error en el campo identificacion, su contenido no es válido");
        }
    }
    
    public void btnAdicionar() {
        try {
            String ideEst = ent.getTextideEst().getText();
            String nomEst = ent.getTextnomEst().getText();
            String apeEst = ent.getTextapeEst().getText();
            float valMatSem = Float.parseFloat(ent.getTextvalMatSem().getText());
            float proSem = Float.parseFloat(ent.getTextproSem().getText());
            
            if (val.validarNumeroEnteroPositivo(ideEst) &&
                val.validarNombre(nomEst) &&
                val.validarApellido(apeEst) &&
                val.validarNumeroRealPositivo(String.valueOf(valMatSem)) &&
                val.validarNumeroRealPositivo(String.valueOf(proSem))) {
                
                estudiantes p = new estudiantes(ideEst, nomEst, apeEst, valMatSem, proSem);
                admCol.adicionar(p);
                btnNuevo();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor valide los datos antes de adicionar", "Error de validación", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
            JOptionPane.showMessageDialog(null, "Error en el formato de los datos numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            btnNuevo();
            UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
        }
    }

    public void btnNuevo() {
        ent.getTextideEst().setText("");
        ent.getTextnomEst().setText("");
        ent.getTextapeEst().setText("");
        ent.getTextproSem().setText("");
        ent.getTextvalMatSem().setText("");
        ent.getTextideEst().requestFocus();
    }

    public void btnVer() {
        admCol.recorrerCola();
    }

    public void btnPrimero() {
        admCol.primero();
    }

    public void btnEliminar() {
        admCol.eliminar();
    }
    
    
    public void btnBuscarIdeEst() {
        String ide = ent.getTextideEst().getText().trim();
        if (ide.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una identificación para buscar");
            return;
        }
        
        estudiantes encontrado = admCol.buscarPorIdentificacion(ide);
        if (encontrado != null) {
            ArrayList<estudiantes> resultado = new ArrayList<>();
            resultado.add(encontrado);
            admCol.mostrarResultadosBusqueda(resultado);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró estudiante con esa identificación");
        }
    }
    
    public void btnBuscarapeEst() {
        String apellido = ent.getTextapeEst().getText().trim();
        if (apellido.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un apellido para buscar");
            return;
        }
        
        ArrayList<estudiantes> resultados = admCol.buscarPorApellido(apellido);
        admCol.mostrarResultadosBusqueda(resultados);
    }
    
    public void btnBuscarnomEst() {
        String nombre = ent.getTextnomEst().getText().trim();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre para buscar");
            return;
        }
        
        ArrayList<estudiantes> resultados = admCol.buscarPorNombre(nombre);
        admCol.mostrarResultadosBusqueda(resultados);
    }
    
    public void btnBuscarproSem() {
        String promedioStr = ent.getTextproSem().getText().trim();
        if (promedioStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un promedio para buscar");
            return;
        }
        
        try {
            float promedio = Float.parseFloat(promedioStr);
            ArrayList<estudiantes> resultados = admCol.buscarPorPromedio(promedio);
            admCol.mostrarResultadosBusqueda(resultados);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un promedio válido");
        }
    }
    
    public void btnBuscarvalmatSem() {
        String valorStr = ent.getTextvalMatSem().getText().trim();
        if (valorStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor de matrícula para buscar");
            return;
        }
        
        try {
            float valor = Float.parseFloat(valorStr);
            ArrayList<estudiantes> resultados = admCol.buscarPorValorMatricula(valor);
            admCol.mostrarResultadosBusqueda(resultados);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor de matrícula válido");
        }
    }
    
    private void btnCalcular() {
        if (!validarEstudiante()) {
            return;
        }
        porSubMat = est.determinarPorcentajeSubsidio(est.getProSem());
        valSubOng = est.valorSubsidio(est.getValMatSem(), porSubMat);
        valPagSub = est.getValMatSem() - valSubOng;
        
        switch ((int) porSubMat) {
            case 100:
                numEstSub100++;
                dinTotSub100 += valSubOng;
                break;
            case 80:
                numEstSub80++;
                dinTotSub80 += valSubOng;
                break;
            case 60:
                numEstSub60++;
                dinTotSub60 += valSubOng;
                break;
            case 40:
                numEstSub40++;
                dinTotSub40 += valSubOng;
                break;
            case 20:
                numEstSub20++;
                dinTotSub20 += valSubOng;
                break;
            case 0:
                numEstSub00++;
                break;
        }
        
        
        Object contenido[] = {est.getIdeEst(), est.getApeEst(), est.getNomEst(), 
            f3.format(est.getValMatSem()), f2.format(porSubMat / 100), f3.format(valSubOng), 
            f3.format(valPagSub)};
        modelo.addRow(contenido);
        
       
        
        
        mostrarVistaEnVentana(salPar);
    }

    private void btnTotalizar() {
      
        dinTotSub = est.sumar5Valores(dinTotSub100, dinTotSub80, dinTotSub60, dinTotSub40, dinTotSub20);
        numTotEstSub = (int) est.sumar5Valores(numEstSub100, numEstSub80, numEstSub60, numEstSub40, numEstSub20);
        numTotEstAfi = est.sumar2Valores(numTotEstSub, numEstSub00);

        // Cálculo de porcentajes
        porEstSub100 = est.calcularPorcentajeSubsidiados(numEstSub100, numTotEstAfi);
        porEstSub80 = est.calcularPorcentajeSubsidiados(numEstSub80, numTotEstAfi);
        porEstSub60 = est.calcularPorcentajeSubsidiados(numEstSub60, numTotEstAfi);
        porEstSub40 = est.calcularPorcentajeSubsidiados(numEstSub40, numTotEstAfi);
        porEstSub20 = est.calcularPorcentajeSubsidiados(numEstSub20, numTotEstAfi);
        porEstSub00 = est.calcularPorcentajeSubsidiados(numEstSub00, numTotEstAfi);

        
        tot.getjTextNumEstSub100().setText(String.valueOf(numEstSub100));
        tot.getjTextNumEstSub80().setText(String.valueOf(numEstSub80));
        tot.getjTextNumEstSub60().setText(String.valueOf(numEstSub60));
        tot.getjTextNumEstSub40().setText(String.valueOf(numEstSub40));
        tot.getjTextNumEstSub20().setText(String.valueOf(numEstSub20));
        tot.getjTextnumEstSub00().setText(String.valueOf(numEstSub00));

        tot.getjTextdinTotSub100().setText(f3.format(dinTotSub100));
        tot.getjTextdinTotSub80().setText(f3.format(dinTotSub80));
        tot.getjTextdinTotSub60().setText(f3.format(dinTotSub60));
        tot.getjTextdinTotSub40().setText(f3.format(dinTotSub40));
        tot.getjTextdinTotSub20().setText(f3.format(dinTotSub20));
 
        tot.getjTextporEstSub100().setText(f2.format(porEstSub100/100));
        tot.getjTextporEstSub80().setText(f2.format(porEstSub80/100));
        tot.getjTextporEstSub60().setText(f2.format(porEstSub60/100));
        tot.getjTextporEstSub40().setText(f2.format(porEstSub40/100));
        tot.getjTextporEstSub20().setText(f2.format(porEstSub20/100));
        tot.getjTextporEstSub00().setText(f2.format(porEstSub00/100));

        tot.getjTextnumTotEstSub().setText(f1.format(numTotEstSub));
        tot.getjTextdinTotOtoSub().setText(f3.format(dinTotSub));
        
        
        
        mostrarVistaEnVentana(tot);
    }

    
    private void btnVolverACola() {
       
        ent.getBtnValidar().setEnabled(true);
        ent.getBtnCalcular().setEnabled(false);  
        ent.getBtnTotalizar().setEnabled(false); 
        mostrarVistaCola();
    }
    
    
    private void mostrarVistaEnVentana(JPanel panel) {
        ventanaPrincipal.getContentPane().removeAll();
        ventanaPrincipal.getContentPane().add(panel, BorderLayout.CENTER);
        ventanaPrincipal.revalidate();
        ventanaPrincipal.repaint();
    }
    
    
    public void mostrarVentana() {
        ventanaPrincipal.setVisible(true);
        ent.getTextideEst().requestFocus();
    }

    public void titulo() {
        ventanaPrincipal.setTitle("cola de estudiantes");
        ventanaPrincipal.setLocationRelativeTo(null);
          
        TitledBorder borsalPar = new TitledBorder("Datos de Salida Parciales");
        salPar.setBorder(borsalPar);
          
        TitledBorder bortot = new TitledBorder("Datos de Salidas Totales");
        tot.setBorder(bortot);
    }
    
    public void error(javax.swing.JTextField txtName, String msg) {
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        txtName.setText("");
        txtName.requestFocus();
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }
        
    public boolean validarEstudiante() {
        String ideEst = ent.getTextideEst().getText();
        String nomEst = ent.getTextnomEst().getText();
        String apeEst = ent.getTextapeEst().getText();
        String proSemStr = ent.getTextproSem().getText();
        String valMatSemStr = ent.getTextvalMatSem().getText();
        
        if (ideEst.isEmpty() || nomEst.isEmpty() || 
            apeEst.isEmpty() || proSemStr.isEmpty() || 
            valMatSemStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            float proSem = Float.parseFloat(proSemStr);
            float valMatSem = Float.parseFloat(valMatSemStr);
            
            if (proSem < 0 || proSem > 5) {
                JOptionPane.showMessageDialog(null, "El promedio del semestre debe estar entre 0 y 5", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            if (valMatSem <= 0) {
                JOptionPane.showMessageDialog(null, "El valor de la matrícula debe ser mayor que 0", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Los campos numéricos deben contener valores válidos", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    public void habilitarbtn(){
        ent.getBtnValidar().setEnabled(true);
        ent.getBtnCalcular().setEnabled(true); 
        ent.getBtnTotalizar().setEnabled(true);
        ent.getBtnBuscarIdeEst().setEnabled(true);
        ent.getBtnBuscarapeEst().setEnabled(true);
        ent.getBtnBuscarnomEst().setEnabled(true);
        ent.getBtnBuscarproSem().setEnabled(true);
        ent.getBtnBuscarvalmatSem().setEnabled(true);
    }
    
    
    

    public void actionPerformed(ActionEvent e) {
        
    }
}