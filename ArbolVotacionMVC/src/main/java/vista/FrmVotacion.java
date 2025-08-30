
package vista;

public class FrmVotacion extends javax.swing.JFrame {

    /**
     * Creates new form FrmVotacion
     */
    public FrmVotacion() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOpcionesAvanzadas = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblIdentificacion = new javax.swing.JLabel();
        lblNombres1 = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        btnVanessa = new javax.swing.JButton();
        btnMoises = new javax.swing.JButton();
        btnVotoBlanco = new javax.swing.JButton();
        btnSantiago = new javax.swing.JButton();
        btnTotalizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnOpcionAvanzadas = new javax.swing.JButton();

        btnOpcionesAvanzadas.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnOpcionesAvanzadas.setText("OPCIONES AVANZADAS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdentificacion.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblIdentificacion.setText("DOCUMENTO:");

        lblNombres1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblNombres1.setText("NOMBRES:");

        lblApellidos.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblApellidos.setText("APELLIDOS:");

        lblTitulo1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        lblTitulo1.setText("Sistema de Votación 2025");

        btnVanessa.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnVanessa.setText("VANESSA");

        btnMoises.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnMoises.setText("MOISES");

        btnVotoBlanco.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnVotoBlanco.setText("VOTO EN BLANCO");

        btnSantiago.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnSantiago.setText("SANTIAGO");

        btnTotalizar.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnTotalizar.setText("TOTALIZAR");

        btnNuevo.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnNuevo.setText("NUEVO");

        btnCalcular.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnCalcular.setText("CALCULAR");

        btnSalir.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnSalir.setText("SALIR");

        btnInsertar.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnInsertar.setText("INSERTAR");

        btnOpcionAvanzadas.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        btnOpcionAvanzadas.setText("OPCIONES AVANZADAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(lblTitulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblApellidos)
                                    .addComponent(lblNombres1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblIdentificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnInsertar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTotalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMoises, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVotoBlanco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSantiago, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVanessa, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOpcionAvanzadas)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombres1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidos)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdentificacion)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSantiago, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVanessa, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertar)
                            .addComponent(btnTotalizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir)
                            .addComponent(btnNuevo))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpcionAvanzadas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoises, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVotoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVotacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalcular;
    public javax.swing.JButton btnInsertar;
    public javax.swing.JButton btnMoises;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnOpcionAvanzadas;
    public javax.swing.JButton btnOpcionesAvanzadas;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnSantiago;
    public javax.swing.JButton btnTotalizar;
    public javax.swing.JButton btnVanessa;
    public javax.swing.JButton btnVotoBlanco;
    public javax.swing.JLabel lblApellidos;
    public javax.swing.JLabel lblIdentificacion;
    public javax.swing.JLabel lblNombres1;
    private javax.swing.JLabel lblTitulo1;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtDocumento;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
