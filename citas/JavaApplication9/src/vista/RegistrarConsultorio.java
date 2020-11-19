/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;




/**
 *
 * @author hp
 */
public class RegistrarConsultorio extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarConsultorio
     */
    public RegistrarConsultorio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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

        BAceptar.setText("Aceptar");

        BNuevo.setText("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(BAceptar)
                .addGap(47, 47, 47)
                .addComponent(BNuevo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblNumeroConsultorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtNumeroConsultorio)
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblNombreConsultorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtNombreConsultorio))
                .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNumeroConsultorio)
                    .addComponent(LblNombreConsultorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNumeroConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombreConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAceptar)
                    .addComponent(BNuevo))
                .addGap(44, 44, 44))

        );

        pack();
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BNuevo;
    private javax.swing.JLabel LblNombreConsultorio;
    private javax.swing.JLabel LblNumeroConsultorio;
    private javax.swing.JTextField TxtNombreConsultorio;
    private javax.swing.JTextField TxtNumeroConsultorio;
    // End of variables declaration
}
