package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConsultorioControl implements ActionListener {

    vista.RegistrarConsultorio consultoriovista;
    modelo.Consultorio consultorioModelo;
    modelo.GestorConsultorio gestorConsultorioModelo;

    public ConsultorioControl(vista.RegistrarConsultorio consultoriovista) {

        this.consultoriovista = consultoriovista;
        this.gestorConsultorioModelo= new modelo.GestorConsultorio();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(consultoriovista.BAceptar)) {
            String identificacion = consultoriovista.TxtNumeroConsultorio.getText();
            String nombres = consultoriovista.TxtNombreConsultorio.getText();

            this.consultorioModelo = new modelo.Consultorio(identificacion, nombres);
            this.gestorConsultorioModelo.RegistrarConsulorioDB(consultorioModelo);
        }
        if (e.getSource().equals(consultoriovista.BNuevo)) {

            consultoriovista.TxtNumeroConsultorio.setText("");

            
            consultoriovista.TxtNombreConsultorio.setText("");


        }
    }

}
