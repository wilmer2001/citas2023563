package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import recursos.*;

public class GestorPacientes {

    private static LinkedList<Paciente> pacientes;
    private static Connection con;

    public GestorPacientes() {
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
        pacientes = new LinkedList<Paciente>();
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
        // pacientes.add(paciente);
    }

    public LinkedList<Paciente> getPacientebyParametro(int parametro, String valor) {
        LinkedList<Paciente> resultado = new LinkedList<Paciente>();
        String sql = "";

        //   for (Paciente pac : pacientes) {
        switch (parametro) {
            case 1:
                // if (pac.getIdentificador().equals(valor)) {
                sql = "select * from pacientes where pacIdentificador='" + valor + "'";
                //}
                //resultado.add(pac);
                break;
            case 2:
                //  if (pac.getNombres().equals(valor)) {
                sql = "select * from pacientes where pacNombres='" + valor + "'";
                // }
                // resultado.add(pac);
                break;
            case 3:
                // if (pac.getApellidos().equals(valor)) {
                sql = "select * from pacientes where pacApellidos='" + valor + "'";
                // }
                // resultado.add(pac);
                break;
            case 4:
                // if (pac.getSexo().equals(valor)) {
                sql = "select * from pacientes where pacSexo='" + valor + "'";
                // }
                //resultado.add(pac);
                break;

        }

        try {
            Statement st = con.createStatement();
            ResultSet rsi = st.executeQuery(sql);
            while (rsi.next()) {
                String identificador = rsi.getString("pacIdentificador");
                String nombre = rsi.getString("pacNombres");
                String apellido = rsi.getString("pacApellidos");
                String fechaNacimiento = rsi.getString("pacFechaNacimiento");
                String genero = rsi.getString("pacSexo");
                Paciente paciente = new Paciente(identificador, nombre, apellido,fechaNacimiento, genero);

                resultado.add(new Paciente(identificador, nombre, apellido,fechaNacimiento, genero));

            }
            // st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
           // JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        return resultado;
    }
}
