package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class GestorMedicoControl implements ActionListener {

    modelo.GestorMedico medicoModelo;
    vista.Consultar_medicos consultarmedicovista;

    public GestorMedicoControl(vista.Consultar_medicos consultarmedicovista) {
        this.consultarmedicovista = consultarmedicovista;
        medicoModelo = new modelo.GestorMedico();
    }

    public void actionPerformed(ActionEvent e) {
        DefaultTableModel modelo;
        String valor = consultarmedicovista.txtbusqueda.getText();
        int parametro = 0;
        if (consultarmedicovista.ridentificacion.isSelected()) {
            parametro = 1;
        }
        if (consultarmedicovista.rnombre.isSelected()) {
            parametro = 2;
        }
        if (consultarmedicovista.rapellido.isSelected()) {
            parametro = 3;
        }
        if (consultarmedicovista.rsexo.isSelected()) {
            parametro = 4;
        }
        LinkedList<modelo.Medico> medico;
        medico = medicoModelo.getMedicobyParametro(parametro, valor);
        String registro[] = new String[5];

        String[] Titulos = {"Identificacion", "Nombre", "Apellidos", "Fecha Nacimiento", "Genero "};
        modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(Titulos);
        for (modelo.Medico p : medico) {

            registro[0] = p.getMedidentificador();
            registro[1] = p.getMednombres();
            registro[2] = p.getMedapellido();
            registro[3] = p.getMedfecha();
            registro[4] = p.getMedgenero();
            modelo.addRow(registro);
        }

        consultarmedicovista.tresultado.setModel(modelo);
    }

}
