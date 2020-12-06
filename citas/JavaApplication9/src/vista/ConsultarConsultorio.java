
package vista;

public class ConsultarConsultorio extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;

    
    private controlador.GestorConsultorioControl consultorioControl;
    public ConsultarConsultorio() {
        initComponents();
        consultorioControl =new controlador.GestorConsultorioControl(this);
        BotAceptar.addActionListener(consultorioControl);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadNumeroConsultorio = new javax.swing.JRadioButton();
        RadNombreConsultorio = new javax.swing.JRadioButton();
        LblBuscar = new javax.swing.JLabel();
        BotAceptar = new javax.swing.JButton();
        TxtBuscador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDatos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Consultorio");

        RadNumeroConsultorio.setText("Número de Consultorio");

        RadNombreConsultorio.setText("Nombre de Consultorio");
        RadNombreConsultorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadNombreConsultorioActionPerformed(evt);
            }
        });

        LblBuscar.setText("Buscar:");

        BotAceptar.setText("Aceptar");
        BotAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAceptarActionPerformed(evt);
            }
        });

        TDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Número de Consultorio", "Nombre de Consultorio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(RadNumeroConsultorio)
                        .addGap(18, 18, 18)
                        .addComponent(RadNombreConsultorio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(TxtBuscador)
                        .addGap(18, 18, 18)
                        .addComponent(BotAceptar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadNumeroConsultorio)
                    .addComponent(RadNombreConsultorio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblBuscar)
                    .addComponent(BotAceptar)
                    .addComponent(TxtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadNombreConsultorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadNombreConsultorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadNombreConsultorioActionPerformed

    private void BotAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAceptarActionPerformed
       this.setVisible(true);
    }//GEN-LAST:event_BotAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotAceptar;
    public javax.swing.JLabel LblBuscar;
    public javax.swing.JRadioButton RadNombreConsultorio;
    public javax.swing.JRadioButton RadNumeroConsultorio;
    public javax.swing.JTable TDatos;
    public javax.swing.JTextField TxtBuscador;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
