/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author hp
 */
public class ConsultarConsultorio extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarConsultorio
     */
    public ConsultarConsultorio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        RNumero = new javax.swing.JRadioButton();
        RNombre = new javax.swing.JRadioButton();
        JLabel LblBuscar = new javax.swing.JLabel();
        TxtBuscador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDatos = new javax.swing.JTable();
        JButton BAceptar = new javax.swing.JButton();


        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Consultorio");

        RNumero.setText("Número");

        RNombre.setText("Nombre");

        LblBuscar.setText("Buscar:");

        TxtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscadorActionPerformed(evt);
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

        BAceptar.setText("Aceptar");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()

                        .addGap(75, 75, 75)
                        .addComponent(RNumero)
                        .addGap(45, 45, 45)
                        .addComponent(RNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(LblBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(TxtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BAceptar)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))

        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()

                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RNumero)
                    .addComponent(RNombre))

                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblBuscar)
                    .addComponent(TxtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAceptar))

                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))

        );

        pack();
    }// </editor-fold>

    private void TxtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }



    // Variables declaration - do not modify
    private javax.swing.JRadioButton RNombre;
    private javax.swing.JRadioButton RNumero;
    private javax.swing.JTable TDatos;
    private javax.swing.JTextField TxtBuscador;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JScrollPane jScrollPane1;

    // End of variables declaration                   
}
