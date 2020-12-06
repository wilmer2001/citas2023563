package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class PacienteControl implements ActionListener {

    vista.registrarpacientes pacientevista;
    modelo.Paciente pacienteModelo;
    modelo.GestorPacientes gestorPacienteModelo;

    public PacienteControl(vista.registrarpacientes pacientevista) {

        this.pacientevista = pacientevista;
        this.gestorPacienteModelo = new modelo.GestorPacientes();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(pacientevista.jButton1)) {
            String identificacion = pacientevista.txtidentificacion.getText();
            String nombres = pacientevista.txtnombre.getText();
            String apellidos = pacientevista.txtapellido.getText();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_nacimiento = formato.format(pacientevista.jDateChooser1.getDate());
            String sexo = null;
            if (pacientevista.jRadioButton1.isSelected()) {
                sexo = "M";
            } else if (pacientevista.jRadioButton2.isSelected()) {
                sexo = "F";
            }
            this.pacienteModelo = new modelo.Paciente(identificacion, nombres, apellidos, fecha_nacimiento, sexo);
            this.gestorPacienteModelo.registrarPacientes(pacienteModelo);
        }
        if (e.getSource().equals(pacientevista.jButton2)) {

            pacientevista.txtidentificacion.setText("");

            pacientevista.txtnombre.setText("");

            pacientevista.txtapellido.setText("");

            pacientevista.jDateChooser1.setDate(null);

            pacientevista.jRadioButton1.setSelected(true);

            pacientevista.jRadioButton2.setSelected(false);

            pacientevista.txtidentificacion.requestFocus();
        }
    }

}
