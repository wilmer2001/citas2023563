package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class GestorPacienteControl implements ActionListener {

    modelo.GestorPacientes pacientesModelo;
    vista.consultarpacientes consultarpacientevista;

    public GestorPacienteControl(vista.consultarpacientes consultarPacienteVista) {
        this.consultarpacientevista = consultarPacienteVista;
        pacientesModelo = new modelo.GestorPacientes();
    }

    public void actionPerformed(ActionEvent e) {
        DefaultTableModel modelo;
        String valor = consultarpacientevista.txt_valor.getText();
        int parametro = 0;
        if (consultarpacientevista.rdb_identificacion.isSelected()) {
            parametro = 1;
        }
        if (consultarpacientevista.rbd_nombre.isSelected()) {
            parametro = 2;
        }
        if (consultarpacientevista.rbd_apellido.isSelected()) {
            parametro = 3;
        }
        if (consultarpacientevista.rbd_genero.isSelected()) {
            parametro = 4;
        }
        LinkedList<modelo.Paciente> paciente;
        paciente = pacientesModelo.getPacientebyParametro(parametro, valor);
        String registro[] = new String[5];

        String[] Titulos = {"Identificacion", "Nombre", "Apellidos", "Fecha_Nacimiento", "Genero "};
        modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(Titulos);
        for (modelo.Paciente p : paciente) {

            registro[0] = p.getIdentificador();
            registro[1] = p.getNombres();
            registro[2] = p.getApellidos();
            registro[3] = p.getFechaNacimiento();
            registro[4] = p.getSexo();
            modelo.addRow(registro);
        }

        consultarpacientevista.tbl_datos.setModel(modelo);
    }
}
