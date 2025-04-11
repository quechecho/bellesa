
package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import model.Belleza;
import validate.Validar;
import view.Entrada;
import view.Parcial;
import view.Total;
import view.VistaBelleza;

public class ControladorBelleza implements ActionListener {
    
    //Atributos de la clase
    private final Belleza bel;
    private final VistaBelleza visBel; 
    private final Entrada ent;
    private final Parcial par;
    private final Total tot;
    private final Validar val; 
    
    //Variables auxiliares
    float porDes, valDes, valPag, valComMay = 0, valComMin = 0, valComOca = 0, valTotCom;
    float porComMay, porComMin, porComOca;
    int numComMay = 0, numComMin = 0, numComOca = 0, numTotCom;
    
    //formatos de salida
    DecimalFormat f1 = new DecimalFormat("###,###,###.##");
    DecimalFormat f2 = new DecimalFormat("#########.#%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");
    
    //Asignar cabecera y valores a la tabla tblparcial del panel Parcial
    String cabecera[] = {"Ident.", "Apellidos", "Nombres", "Val. compra", "% Desc.", "Val. Desc.", "Val. Pagar"};
    String datos[][] = {};
    DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);
    
    //Constructor

    public ControladorBelleza(Belleza bel, VistaBelleza visBel, Entrada ent, Parcial par, Total tot, Validar val) {
        this.bel = bel;
        this.visBel = visBel;
        this.ent = ent;
        this.par = par;
        this.tot = tot;
        this.val = val;
        
        //Adición de botones y demás componentes gráficos
        this.visBel.getBtnValidar().addActionListener(e ->{btnValidar();});
        this.visBel.getBtnCalcular().addActionListener(e ->{btnCalcular();});
        this.visBel.getBtnTotalizar().addActionListener(e ->{btnTotalizar();});
        this.visBel.getBtnNuevo().addActionListener(e ->{btnNuevo();});
        this.visBel.getBtnSalir().addActionListener(e ->{System.exit(0);});
        this.par.getBtnVolver().addActionListener(e ->{btnVolver();});
        this.tot.getBtnVolver().addActionListener(e ->{btnVolver();});
        
        this.ent.getCmbTipCli().addActionListener(this);
        
        //Asignar el modelo a la tabla
        par.getTblParcial().setModel(modelo);
    }
    
    public void btnValidar() {
        if (val.validarNumeroEnteroPositivo(ent.getTxtIdeCli().getText())) {
            bel.setIdeCli(ent.getTxtIdeCli().getText());
            if (val.validarApellido(ent.getTxtApeCli().getText())) {
                bel.setApeCli(ent.getTxtApeCli().getText());
                if (val.validarNombre(ent.getTxtNomCli().getText())) {
                    bel.setNomCli(ent.getTxtNomCli().getText());
                    switch (ent.getCmbTipCli().getSelectedIndex()) {
                        case 0 ->
                            bel.setTipCli(1);
                        case 1 ->
                            bel.setTipCli(2);
                        case 2 ->
                            bel.setTipCli(3);

                    }
                    if (val.validarNumeroEnteroPositivo(ent.getTxtAntCli().getText())) {
                        bel.setAntCli(Integer.parseInt(ent.getTxtAntCli().getText()));
                        if (val.validarNumeroRealPositivo(ent.getTxtValCom().getText())) {
                            bel.setValCom(Float.parseFloat(ent.getTxtValCom().getText()));
                            visBel.getBtnCalcular().setEnabled(true);
                            visBel.getBtnTotalizar().setEnabled(true);
                        } else {
                            error(ent.getTxtValCom(), "Error en el campo valor de la compra, su contenido no es válido");
                        }
                    } else {
                        error(ent.getTxtAntCli(), "Error en el campo antigüedad del cliente, su contenido no es válido");
                    }

                } else {
                    error(ent.getTxtNomCli(), "Error en el campo nombre del cliente, su contenido no es válido");
                }
            } else {
                error(ent.getTxtApeCli(), "Error en el campo apellido del cliente, su contenido no es válido");
            }
        } else {
            error(ent.getTxtIdeCli(), "Error en el campo identificación del cliente, su contenido no es válido");
        }
    }
    
    public void btnCalcular() {

        try {
            //Procesos parciales
            porDes = bel.determinarPorcentaje(bel.getTipCli(), bel.getAntCli(), bel.getValCom());
            valDes = bel.valorDescuento(bel.getValCom(), porDes);
            valPag = bel.valorPagar(bel.getValCom(), valDes);
            validarCliente();

            //Datoas de salida parciales
            Object contenido[] = {bel.getIdeCli(), bel.getApeCli(), bel.getNomCli(),
                f3.format(bel.getValCom()), f2.format(porDes / 100), f3.format(valDes),
                f3.format(valPag)};
            modelo.addRow(contenido);
            desHabilitarBtn();
            showPane(par);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "]ERROR", "eRROR: " + ex, JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void btnTotalizar() {
        try {
            //Procesesos totales
            valTotCom = bel.sumar3Valores(valComMay, valComMin, valComOca);
            numTotCom = bel.sumar3Valores(numComMay, numComMin, numComOca);
            porComMay = bel.calcularPorcentaje((float) numComMay, (float) numTotCom);
            porComMin = bel.calcularPorcentaje((float) numComMin, (float) numTotCom);
            porComOca = bel.calcularPorcentaje((float) numComOca, (float) numTotCom);

            //Datos de salida totales
            tot.getTxtNumComMay().setText(String.valueOf(numComMay));
            tot.getTxtNumComMin().setText(String.valueOf(numComMin));
            tot.getTxtNumComOca().setText(String.valueOf(numComOca));

            tot.getTxtValComMay().setText(f3.format(valComMay));
            tot.getTxtValComMin().setText(f3.format(valComMin));
            tot.getTxtValComOca().setText(f3.format(valComOca));

            tot.getTxtPorComMay().setText(f2.format(porComMay / 100));
            tot.getTxtPorComMin().setText(f2.format(porComMin / 100));
            tot.getTxtPorComOca().setText(f2.format(porComOca / 100));

            tot.getTxtNumTotCom().setText(f1.format(numTotCom));
            desHabilitarBtn();
            showPane(tot);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "]ERROR", "eRROR: " + ex, JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void btnNuevo(){
        ent.getTxtIdeCli().setText("");
        ent.getTxtApeCli().setText("");
        ent.getTxtNomCli().setText("");
        ent.getTxtAntCli().setText("");
        ent.getTxtValCom().setText("");
        ent.getTxtIdeCli().requestFocus();
    }
    
     public void btnVolver(){
        habilitarBtn();
        showPane(ent);
        btnNuevo();
    }
     
    
    public void titulo() {
        visBel.setTitle("Descuento por compras");
        visBel.setLocationRelativeTo(null);

        TitledBorder borEnt = new TitledBorder("Datos de entrada");
        ent.setBorder(borEnt);

        TitledBorder borPar = new TitledBorder("Datos de salida parciales");
        par.setBorder(borPar);

        TitledBorder borTot = new TitledBorder("Datos de salida totales");
        tot.setBorder(borTot);
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
    
    public void validarCliente(){
        switch(bel.getTipCli()){
            case 1 ->{
                numComMay = bel.contar(numComMay);
                valComMay = bel.acumular(valComMay, valPag);
                //System.out.println("NumComMay = "+numComMay);
            }
            case 2 -> {
                numComMin = bel.contar(numComMin);
                valComMin = bel.acumular(valComMin, valPag);
                //System.out.println("NumComMin = "+numComMin);
            }
            case 3 -> {
                numComOca = bel.contar(numComOca);
                valComOca = bel.acumular(valComOca, valPag);
                //System.out.println("NumComOca = "+numComOca);
            }
        }
    }
    
    //Hacer visible un panel
    public void showPane(JPanel p) {
        p.setSize(800, 500);
        p.setLocation(0, 0);

        visBel.getContenedor().removeAll();
        visBel.getContenedor().add(p, BorderLayout.CENTER);
        visBel.getContenedor().revalidate();
        visBel.getContenedor().repaint();
    }
    
    public void habilitarBtn(){
        visBel.getBtnValidar().setEnabled(true);
        //visBel.getBtnCalcular().setEnabled(true);
        visBel.getBtnTotalizar().setEnabled(true);
        visBel.getBtnNuevo().setEnabled(true);
        visBel.getBtnSalir().setEnabled(true);
    }
    
    public void desHabilitarBtn(){
        visBel.getBtnValidar().setEnabled(false);
        visBel.getBtnCalcular().setEnabled(false);
        visBel.getBtnTotalizar().setEnabled(false);
        visBel.getBtnNuevo().setEnabled(false);
        visBel.getBtnSalir().setEnabled(false);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
