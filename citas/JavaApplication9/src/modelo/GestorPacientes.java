package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import recursos.*;

public class GestorPacientes {

    public static LinkedList<Paciente> pacientes;
    private static Connection con;

    public GestorPacientes() {
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
    }

    public void registrarPacientes(Paciente paciente) {

        PreparedStatement pst;
        try {
            pst = con.prepareStatement("INSERT INTO pacientes (pacIdentificador, pacNombres, pacApellidos, pacFechaNacimiento, pacSexo) VALUES (?, ?, ?, ?, ?)");
            pst.setString(1, paciente.getIdentificador());
            pst.setString(2, paciente.getNombres());
            pst.setString(3, paciente.getApellidos());
            pst.setString(4, paciente.getFechaNacimiento());
            pst.setString(5, paciente.getSexo());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente Registrado");

        } catch (SQLException ex) {
            Logger.getLogger(GestorPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
//        pacientes.add(paciente);
    }

    public LinkedList<Paciente> getPacientebyParametro(int parametro, String valor) {
        LinkedList<Paciente> resultado = new LinkedList<Paciente>();
        String sql = "";

        for (Paciente pac : pacientes) {
            switch (parametro) {
                case 1:
                    if (pac.getIdentificador().equals(valor)) {
                        sql = "select * from pacientes where PACIDENTIFICACION='" + valor + "'";
                    }
                    resultado.add(pac);
                    break;
                case 2:
                    if (pac.getNombres().equals(valor)) {
                        sql = "select * from pacientes where PACNOMBRES='" + valor + "'";
                    }
                    resultado.add(pac);
                    break;
                case 3:
                    if (pac.getApellidos().equals(valor)) {
                        sql = "select * from pacientes where PACAPELLIDOS='" + valor + "'";
                    }
                    resultado.add(pac);
                    break;
                case 4:
                    if (pac.getSexo().equals(valor)) {
                        sql = "select * from pacientes where PACGENERO='" + valor + "'";
                    }
                    resultado.add(pac);
                    break;
            }
        }
        return null;

    }

}
