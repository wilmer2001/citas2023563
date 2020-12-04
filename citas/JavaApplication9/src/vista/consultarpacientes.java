
package vista;

public class consultarpacientes extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;

    
    private controlador.GestorPacienteControl pacienteControlador;
    public consultarpacientes() {
        initComponents();
        pacienteControlador =new controlador.GestorPacienteControl(this);
        btn_aceptar.addActionListener(pacienteControlador);
        //.addActionListener(pacienteControlador);*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdb_identificacion = new javax.swing.JRadioButton();
        rbd_nombre = new javax.swing.JRadioButton();
        rbd_apellido = new javax.swing.JRadioButton();
        rbd_genero = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        rdb_identificacion.setText("Identificacion");
        rdb_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_identificacionActionPerformed(evt);
            }
        });

        rbd_nombre.setText("Nombres");

        rbd_apellido.setText("Apellidos");
        rbd_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd_apellidoActionPerformed(evt);
            }
        });

        rbd_genero.setText("Sexo");
        rbd_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbd_generoActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor a buscar:");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdb_identificacion)
                        .addGap(18, 18, 18)
                        .addComponent(rbd_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbd_apellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbd_genero)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_valor)))
                .addGap(18, 18, 18)
                .addComponent(btn_aceptar)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_identificacion)
                    .addComponent(rbd_nombre)
                    .addComponent(rbd_apellido)
                    .addComponent(rbd_genero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbd_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbd_apellidoActionPerformed

    private void rbd_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbd_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbd_generoActionPerformed

    private void rdb_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_identificacionActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        this.setVisible(true);
    }//GEN-LAST:event_btn_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rbd_apellido;
    public javax.swing.JRadioButton rbd_genero;
    public javax.swing.JRadioButton rbd_nombre;
    public javax.swing.JRadioButton rdb_identificacion;
    public javax.swing.JTable tbl_datos;
    public javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

    
}
