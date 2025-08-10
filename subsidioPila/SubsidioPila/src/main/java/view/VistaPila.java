
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaPila extends javax.swing.JFrame {

    public VistaPila() {
        initComponents();
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        textapeEst = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textnomEst = new javax.swing.JTextField();
        textproSem = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnTotalizar = new javax.swing.JButton();
        btnValidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Pila de pesonas");

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ver.png"))); // NOI18N
        btnVer.setText("Ver");

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.jpg"))); // NOI18N
        btnPrimero.setText("Primero");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");

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

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");

        jLabel4.setText("Identificacion ");

        textideEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textideEstActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor de matricula ");

        btnBuscarapeEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar.png"))); // NOI18N
        btnBuscarapeEst.setText("Buscar ==");
        btnBuscarapeEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarapeEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarapeEstActionPerformed(evt);
            }
        });

        btnBuscarnomEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar.png"))); // NOI18N
        btnBuscarnomEst.setText("Buscar ==");
        btnBuscarnomEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarproSem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar.png"))); // NOI18N
        btnBuscarproSem.setText("Buscar ==");
        btnBuscarproSem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBuscarvalmatSem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar.png"))); // NOI18N
        btnBuscarvalmatSem.setText("Buscar ==");
        btnBuscarvalmatSem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarvalmatSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarvalmatSemActionPerformed(evt);
            }
        });

        btnBuscarIdeEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Buscar.png"))); // NOI18N
        btnBuscarIdeEst.setText("Buscar ==");
        btnBuscarIdeEst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarIdeEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdeEstActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido");

        jLabel2.setText("Nombres");

        jLabel3.setText("promedio");

        textproSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textproSemActionPerformed(evt);
            }
        });

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calcular.png"))); // NOI18N
        btnCalcular.setText("Calcular");

        btnTotalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Total.png"))); // NOI18N
        btnTotalizar.setText("Totalizar");

        btnValidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Validar.png"))); // NOI18N
        btnValidar.setText("Validar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textideEst, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textnomEst, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBuscarIdeEst, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarnomEst, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarapeEst, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarproSem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textvalMatSem)
                                    .addComponent(textproSem, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textapeEst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarvalmatSem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnCalcular)
                        .addGap(62, 62, 62)
                        .addComponent(btnTotalizar)
                        .addGap(62, 62, 62)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPrimero)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textideEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdeEst))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textnomEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscarnomEst))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textapeEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarapeEst)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textproSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarproSem)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textvalMatSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarvalmatSem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnPrimero)
                    .addComponent(btnEliminar)
                    .addComponent(btnValidar)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textideEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textideEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textideEstActionPerformed

    private void btnBuscarIdeEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdeEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarIdeEstActionPerformed

    private void textproSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textproSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textproSemActionPerformed

    private void btnBuscarapeEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarapeEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarapeEstActionPerformed

    private void btnBuscarvalmatSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarvalmatSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarvalmatSemActionPerformed

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

    public Object getTblEstudiante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
