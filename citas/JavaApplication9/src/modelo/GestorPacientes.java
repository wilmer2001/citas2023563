package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import recursos.conexion;
import vista.registrarpacientes;

public class GestorPacientes {

    public static LinkedList<Paciente> pacientes;
    Connection con;
    conexion conectar = new conexion();

    public GestorPacientes() {
        pacientes = new LinkedList<Paciente>();
    }

    public void registrarPacientes(Paciente paciente) {
        pacientes.add(paciente);
    }

    public static LinkedList<Paciente> getPacientebyParametro(int parametro, String valor) {
        LinkedList<Paciente> resultado = new LinkedList<Paciente>();
        for (Paciente pac : pacientes) {

        }
        return null;
    }

    public void registrarPacientesDB(modelo.Paciente paciente) throws SQLException {

        PreparedStatement pst;
        try {
            pst = con.prepareStatement("insert into paciente values(?,?,?,?,?)");
            pst.setString(1, paciente.getIdentificador());
            pst.setString(2, paciente.getNombres());
            pst.setString(3, paciente.getApellidos());
            pst.setString(4, paciente.getFechaNacimiento());
            pst.setString(5, paciente.getSexo());
            JOptionPane.showMessageDialog(null, "Paciente Registrado");
        } catch (SQLException ex) {
            Logger.getLogger(GestorPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        //pacientes.add(paciente);
    }

}
/*public LinkedList<Paciente> getPacientebyParametro(int parametro, String valor) {
        LinkedList<Paciente> resultado = new LinkedList<Paciente>();
        String sql="";
//for(Paciente pac:pacientes)

        switch(parametro){
case 1: if(pac.getIdentificacion().equals(valor))
        sql="select * from pacientes where PACIDENTIFICACION='"+valor+"'";
//  resultado.add(pac);
break;
case 2: if(pac.getNombres().equals(valor))
         sql="select * from pacientes where PACNOMBRES='"+valor+"'";
resultado.add(pac);
break;
case 3: if(pac.getApellidos().equals(valor))
         sql="select * from pacientes where PACAPELLIDOS='"+valor+"'";
resultado.add(pac);
break;
case 4: if(pac.getGenero().equals(valor))
         sql="select * from pacientes where PACGENERO='"+valor+"'";
resultado.add(pac);
break;
}*/
