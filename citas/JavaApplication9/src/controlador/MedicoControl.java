package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class MedicoControl implements ActionListener {

    vista.Registrar_medicos Medicovista;
    modelo.Medico medicoModelo;
    modelo.GestorMedico gestormedicomodelo;
    

    public MedicoControl(vista.Registrar_medicos Medicovista) {
        this.Medicovista = Medicovista;
        this.gestormedicomodelo = new modelo.GestorMedico();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Medicovista.bregistrar)) {
            String identificacion = Medicovista.txtidentificacion.getText();
            String nombres = Medicovista.txtnombre.getText();
            String apellidos = Medicovista.txtapellido.getText();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fecha_nacimiento = formato.format(Medicovista.dcumple.getDate());
            String genero = null;
            if (Medicovista.rhombre.isSelected()) {
                genero = "M";
            }else if(Medicovista.rmujer.isSelected()) {
                genero = "F";
            }
            this.medicoModelo = new modelo.Medico(identificacion, nombres, apellidos, fecha_nacimiento, genero);
            this.gestormedicomodelo.RegistrarMedicos(medicoModelo);
        }

        if (e.getSource().equals(Medicovista.bnuevo)) {
            Medicovista.txtidentificacion.setText("");
            Medicovista.txtnombre.setText("");
            Medicovista.txtapellido.setText("");
            Medicovista.dcumple.setDate(null);
            Medicovista.rhombre.setSelected(true);
            Medicovista.rmujer.setSelected(false);
            Medicovista.txtidentificacion.requestFocus();
        }
    }
}
