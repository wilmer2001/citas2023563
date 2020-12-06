/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


public class RegistrarConsultorio extends javax.swing.JInternalFrame {
    
      private static final long serialVersionUID = 1L;

    private controlador.ConsultorioControl consultorioControl;

    public RegistrarConsultorio() {
        initComponents();
        consultorioControl = new controlador.ConsultorioControl(this);
        BNuevo.addActionListener(consultorioControl);
        BAceptar.addActionListener(consultorioControl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblNumeroConsultorio = new javax.swing.JLabel();
        LblNombreConsultorio = new javax.swing.JLabel();
        BAceptar = new javax.swing.JButton();
        BNuevo = new javax.swing.JButton();
        TxtNumeroConsultorio = new javax.swing.JTextField();
        TxtNombreConsultorio = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Consultorio");

        LblNumeroConsultorio.setText("Número de Consultorio:");

        LblNombreConsultorio.setText("Nombre de Consultorio:");

        BAceptar.setText("Registrar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });

        BNuevo.setText("Nuevo");
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BAceptar)
                        .addGap(40, 40, 40)
                        .addComponent(BNuevo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtNumeroConsultorio)
                            .addComponent(LblNumeroConsultorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblNombreConsultorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtNombreConsultorio))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNumeroConsultorio)
                    .addComponent(LblNombreConsultorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNumeroConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombreConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAceptar)
                    .addComponent(BNuevo))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAceptarActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
         this.setVisible(true);
    }//GEN-LAST:event_BNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAceptar;
    public javax.swing.JButton BNuevo;
    public javax.swing.JLabel LblNombreConsultorio;
    public javax.swing.JLabel LblNumeroConsultorio;
    public javax.swing.JTextField TxtNombreConsultorio;
    public javax.swing.JTextField TxtNumeroConsultorio;
    // End of variables declaration//GEN-END:variables
}
