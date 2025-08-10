
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaCola extends javax.swing.JFrame {

    public VistaCola() {
        initComponents();
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textnomEst = new javax.swing.JTextField();
        textproSem = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblestudiante = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textideEst = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textvalMatSem = new javax.swing.JTextField();
        btnBuscarapeEst = new javax.swing.JButton();
        btnBuscarnomEst = new javax.swing.JButton();
        btnBuscarproSem = new javax.swing.JButton();
        btnBuscarvalmatSem = new javax.swing.JButton();
        btnBuscarIdeEst = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textapeEst = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnValidar = new javax.swing.JButton();
        btnTotalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cola de estudiantes");

        jLabel2.setText("Nombres");

        jLabel3.setText("promedio");

        textproSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textproSemActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ver.png"))); // NOI18N
        btnVer.setText("Ver");

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Back.jpg"))); // NOI18N
        btnPrimero.setText("Primero");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblestudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblestudiante);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel4.setText("Identificacion ");

        textideEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textideEstActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor de matricula ");

        btnBuscarapeEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.png"))); // NOI18N
        btnBuscarapeEst.setText("Buscar ==");
        btnBuscarapeEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarnomEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.png"))); // NOI18N
        btnBuscarnomEst.setText("Buscar ==");
        btnBuscarnomEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarproSem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.png"))); // NOI18N
        btnBuscarproSem.setText("Buscar ==");
        btnBuscarproSem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarvalmatSem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.png"))); // NOI18N
        btnBuscarvalmatSem.setText("Buscar ==");
        btnBuscarvalmatSem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarIdeEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar.png"))); // NOI18N
        btnBuscarIdeEst.setText("Buscar ==");
        btnBuscarIdeEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarIdeEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdeEstActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido");

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Calcular.png"))); // NOI18N
        btnCalcular.setText("Calcular");

        btnValidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Validar.png"))); // NOI18N
        btnValidar.setText("Validar");

        btnTotalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Total.png"))); // NOI18N
        btnTotalizar.setText("Totalizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnCalcular)
                        .addGap(62, 62, 62)
                        .addComponent(btnTotalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnValidar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAdicionar)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textideEst)
                                                .addComponent(textproSem)
                                                .addComponent(textvalMatSem)
                                                .addComponent(textnomEst)
                                                .addComponent(textapeEst, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBuscarIdeEst, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnBuscarproSem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnBuscarnomEst, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnBuscarapeEst, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(btnBuscarvalmatSem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(btnVer)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnPrimero)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNuevo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textideEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdeEst))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textnomEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarnomEst))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textapeEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarapeEst))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textproSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarproSem)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textvalMatSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarvalmatSem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrimero)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textproSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textproSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textproSemActionPerformed

    private void textideEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textideEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textideEstActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnBuscarIdeEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdeEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarIdeEstActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscarIdeEst;
    private javax.swing.JButton btnBuscarapeEst;
    private javax.swing.JButton btnBuscarnomEst;
    private javax.swing.JButton btnBuscarproSem;
    private javax.swing.JButton btnBuscarvalmatSem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTotalizar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblestudiante;
    private javax.swing.JTextField textapeEst;
    private javax.swing.JTextField textideEst;
    private javax.swing.JTextField textnomEst;
    private javax.swing.JTextField textproSem;
    private javax.swing.JTextField textvalMatSem;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAdicionar() {
        return btnAdicionar;
    }

    public void setBtnAdicionar(JButton btnAdicionar) {
        this.btnAdicionar = btnAdicionar;
    }

    public JButton getBtnBuscarIdeEst() {
        return btnBuscarIdeEst;
    }

    public void setBtnBuscarIdeEst(JButton btnBuscarIdeEst) {
        this.btnBuscarIdeEst = btnBuscarIdeEst;
    }

    public JButton getBtnBuscarapeEst() {
        return btnBuscarapeEst;
    }

    public void setBtnBuscarapeEst(JButton btnBuscarapeEst) {
        this.btnBuscarapeEst = btnBuscarapeEst;
    }

    public JButton getBtnBuscarnomEst() {
        return btnBuscarnomEst;
    }

    public void setBtnBuscarnomEst(JButton btnBuscarnomEst) {
        this.btnBuscarnomEst = btnBuscarnomEst;
    }

    public JButton getBtnBuscarproSem() {
        return btnBuscarproSem;
    }

    public void setBtnBuscarproSem(JButton btnBuscarproSem) {
        this.btnBuscarproSem = btnBuscarproSem;
    }

    public JButton getBtnBuscarvalmatSem() {
        return btnBuscarvalmatSem;
    }

    public void setBtnBuscarvalmatSem(JButton btnBuscarvalmatSem) {
        this.btnBuscarvalmatSem = btnBuscarvalmatSem;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public void setBtnCalcular(JButton btnCalcular) {
        this.btnCalcular = btnCalcular;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public void setBtnNuevo(JButton btnNuevo) {
        this.btnNuevo = btnNuevo;
    }

    public JButton getBtnPrimero() {
        return btnPrimero;
    }

    public void setBtnPrimero(JButton btnPrimero) {
        this.btnPrimero = btnPrimero;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtnTotalizar() {
        return btnTotalizar;
    }

    public void setBtnTotalizar(JButton btnTotalizar) {
        this.btnTotalizar = btnTotalizar;
    }

    public JButton getBtnValidar() {
        return btnValidar;
    }

    public void setBtnValidar(JButton btnValidar) {
        this.btnValidar = btnValidar;
    }

    public JButton getBtnVer() {
        return btnVer;
    }

    public void setBtnVer(JButton btnVer) {
        this.btnVer = btnVer;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTblestudiante() {
        return tblestudiante;
    }

    public void setTblestudiante(JTable tblestudiante) {
        this.tblestudiante = tblestudiante;
    }

    public JTextField getTextapeEst() {
        return textapeEst;
    }

    public void setTextapeEst(JTextField textapeEst) {
        this.textapeEst = textapeEst;
    }

    public JTextField getTextideEst() {
        return textideEst;
    }

    public void setTextideEst(JTextField textideEst) {
        this.textideEst = textideEst;
    }

    public JTextField getTextnomEst() {
        return textnomEst;
    }

    public void setTextnomEst(JTextField textnomEst) {
        this.textnomEst = textnomEst;
    }

    public JTextField getTextproSem() {
        return textproSem;
    }

    public void setTextproSem(JTextField textproSem) {
        this.textproSem = textproSem;
    }

    public JTextField getTextvalMatSem() {
        return textvalMatSem;
    }

    public void setTextvalMatSem(JTextField textvalMatSem) {
        this.textvalMatSem = textvalMatSem;
    }  

    
}
