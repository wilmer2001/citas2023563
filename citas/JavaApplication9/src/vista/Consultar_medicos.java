
package vista;


public class Consultar_medicos extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;

    private controlador.GestorMedicoControl medicocontrol;
    public Consultar_medicos() {
        initComponents();
        medicocontrol= new controlador.GestorMedicoControl(this);
        baceptar.addActionListener(medicocontrol);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ridentificacion = new javax.swing.JRadioButton();
        rnombre = new javax.swing.JRadioButton();
        rapellido = new javax.swing.JRadioButton();
        rsexo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        baceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tresultado = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTAR MEDICOS");

        ridentificacion.setText("Identificacion");

        rnombre.setText("Nombre");

        rapellido.setText("Apellido");

        rsexo.setText("Sexo");

        jLabel1.setText("Valor a buscar");

        baceptar.setText("Aceptar");
        baceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baceptarActionPerformed(evt);
            }
        });

        tresultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombre", "Apellido", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(tresultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ridentificacion)
                                .addGap(18, 18, 18)
                                .addComponent(rnombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rapellido)
                                .addGap(18, 18, 18)
                                .addComponent(rsexo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtbusqueda)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ridentificacion)
                    .addComponent(rnombre)
                    .addComponent(rapellido)
                    .addComponent(rsexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void baceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baceptarActionPerformed
        this.setVisible(true);
    }//GEN-LAST:event_baceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton baceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rapellido;
    public javax.swing.JRadioButton ridentificacion;
    public javax.swing.JRadioButton rnombre;
    public javax.swing.JRadioButton rsexo;
    public javax.swing.JTable tresultado;
    public javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables


}
