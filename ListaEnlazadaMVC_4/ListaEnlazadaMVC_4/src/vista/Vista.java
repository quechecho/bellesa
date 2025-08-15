package vista;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        btnAddInicio = new javax.swing.JButton();
        btnAddFinal = new javax.swing.JButton();
        btnAddDespues = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnDelInicio = new javax.swing.JButton();
        btnDelFinal = new javax.swing.JButton();
        btnDelDespues = new javax.swing.JButton();
        btnObtener = new javax.swing.JButton();
        btnContar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        txtIsbn = new javax.swing.JTextField();
        txtNro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnValidar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Lista enlazada libro");

        jLabel2.setText("Título");

        jLabel3.setText("Autor");

        jLabel4.setText("ISBN");

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        btnAddInicio.setText("Add Inicio");
        btnAddInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInicioActionPerformed(evt);
            }
        });

        btnAddFinal.setText("Add Final");
        btnAddFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFinalActionPerformed(evt);
            }
        });

        btnAddDespues.setText("Add Después");
        btnAddDespues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDespuesActionPerformed(evt);
            }
        });

        btnDelInicio.setText("Del Inicio");

        btnDelFinal.setText("Del Final");

        btnDelDespues.setText("Del  Después");
        btnDelDespues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelDespuesActionPerformed(evt);
            }
        });

        btnObtener.setText("Obtener");
        btnObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerActionPerformed(evt);
            }
        });

        btnContar.setText("Contar  Nodos");

        jLabel7.setText("Nodo No.");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnTodos.setText("Mostrar Todos");

        Limpiar.setText("Limpiar");

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane5.setViewportView(tblDatos);

        btnValidar.setText("Validar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnValidar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnAddInicio)
                        .addGap(6, 6, 6)
                        .addComponent(btnAddFinal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDelInicio)
                        .addGap(10, 10, 10)
                        .addComponent(btnDelFinal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnAddDespues)
                        .addGap(6, 6, 6)
                        .addComponent(btnDelDespues)
                        .addGap(12, 12, 12)
                        .addComponent(btnObtener))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnContar)
                        .addGap(49, 49, 49)
                        .addComponent(btnTodos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(Limpiar)
                        .addGap(6, 6, 6)
                        .addComponent(btnSalir)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnValidar))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddInicio)
                    .addComponent(btnAddFinal))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelInicio)
                    .addComponent(btnDelFinal))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnAddDespues))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnDelDespues))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnObtener)))
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContar)
                    .addComponent(btnTodos))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Limpiar)
                    .addComponent(btnSalir))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void btnAddDespuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDespuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDespuesActionPerformed

    private void btnDelDespuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelDespuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelDespuesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObtenerActionPerformed

    private void btnAddFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddFinalActionPerformed

    private void btnAddInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddInicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton btnAddDespues;
    private javax.swing.JButton btnAddFinal;
    private javax.swing.JButton btnAddInicio;
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnDelDespues;
    private javax.swing.JButton btnDelFinal;
    private javax.swing.JButton btnDelInicio;
    private javax.swing.JButton btnObtener;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtNro;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    
    public javax.swing.JButton getBtnAddDespues() {
        return btnAddDespues;
    }

    public void setBtnAddDespues(javax.swing.JButton btnAddDespues) {
        this.btnAddDespues = btnAddDespues;
    }

    public javax.swing.JButton getBtnAddFinal() {
        return btnAddFinal;
    }

    public void setBtnAddFinal(javax.swing.JButton btnAddFinal) {
        this.btnAddFinal = btnAddFinal;
    }

    public javax.swing.JButton getBtnAddInicio() {
        return btnAddInicio;
    }

    public void setBtnAddInicio(javax.swing.JButton btnAddInicio) {
        this.btnAddInicio = btnAddInicio;
    }

    public javax.swing.JButton getBtnContar() {
        return btnContar;
    }

    public void setBtnContar(javax.swing.JButton btnContar) {
        this.btnContar = btnContar;
    }

    public javax.swing.JButton getBtnDelDespues() {
        return btnDelDespues;
    }

    public void setBtnDelDespues(javax.swing.JButton btnDelDespues) {
        this.btnDelDespues = btnDelDespues;
    }

    public javax.swing.JButton getBtnDelFinal() {
        return btnDelFinal;
    }

    public void setBtnDelFinal(javax.swing.JButton btnDelFinal) {
        this.btnDelFinal = btnDelFinal;
    }

    public javax.swing.JButton getBtnDelInicio() {
        return btnDelInicio;
    }

    public void setBtnDelInicio(javax.swing.JButton btnDelInicio) {
        this.btnDelInicio = btnDelInicio;
    }

    public javax.swing.JButton getBtnLimpiar() {
        return Limpiar;
    }

    public void setBtnLimpiar(javax.swing.JButton btnLimpiar) {
        this.Limpiar = btnLimpiar;
    }

    public javax.swing.JButton getBtnObtener() {
        return btnObtener;
    }

    public void setBtnObtener(javax.swing.JButton btnObtener) {
        this.btnObtener = btnObtener;
    }

    public javax.swing.JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(javax.swing.JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public javax.swing.JButton getBtnTodos() {
        return btnTodos;
    }

    public void setBtnTodos(javax.swing.JButton btnTodos) {
        this.btnTodos = btnTodos;
    }

    public javax.swing.JTextField getTxtAutor() {
        return txtAutor;
    }

    public void setTxtAutor(javax.swing.JTextField txtAutor) {
        this.txtAutor = txtAutor;
    }

    public javax.swing.JTextField getTxtIsbn() {
        return txtIsbn;
    }

    public void setTxtIsbn(javax.swing.JTextField txtIsbn) {
        this.txtIsbn = txtIsbn;
    }

    public javax.swing.JTextField getTxtNro() {
        return txtNro;
    }

    public void setTxtNro(javax.swing.JTextField txtNro) {
        this.txtNro = txtNro;
    }

    public javax.swing.JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(javax.swing.JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public javax.swing.JTable getTblDatos() {
        return tblDatos;
    }

    public void setTblDatos(javax.swing.JTable tblDatos) {
        this.tblDatos = tblDatos;
    }

    public javax.swing.JButton getBtnValidar() {
        return btnValidar;
    }

    public void setBtnValidar(javax.swing.JButton btnValidar) {
        this.btnValidar = btnValidar;
    }
  
}
