package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GestorPacientes {
    private static LinkedList<Paciente> pacientes;
    private static Connection conn;

    public GestorPacientes() {
        //recurso.Conexion conexion = new recursos.Conexion("localhost","root","","citas_medicas");    
        //conn=cenexion.getConexion();
    }

    public void RegistrarPacientes(Paciente paciente) throws SQLException {

        PreparedStatement pst;
        try {
            pst = conn.prepareStatement("insert into paciente values(?,?,?,?,?)");
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
   /* public LinkedList<Paciente> getPacientebyParametro(int parametro, String valor) {
        LinkedList<Paciente> resultado = new LinkedList<Paciente>();
        String sql-"";
//for(Paciente pac:pacientes)

        switch(parametro){
case 1: if(pac.getIdentificacion().equals(valor))
resultado.add(pac);
break;
case 2: if(pac.getNombres().equals(valor))
resultado.add(pac);
break;
case 3: if(pac.getApellidos().equals(valor))
resultado.add(pac);
break;
case 4: if(pac.getGenero().equals(valor))
resultado.add(pac);
break;
         */
