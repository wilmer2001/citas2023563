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

public class GestorMedico {

    private static LinkedList<Medico> medicos;
    private static Connection con;

    public GestorMedico() {
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
        medicos = new LinkedList<Medico>();
    }

    public void RegistrarMedicos(Medico medico) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("INSERT INTO medicos (MedIdentificador, MedNombres, MedApellidos, Medfecha, MedGenero) VALUES (?, ?, ?, ?, ?)");
            pst.setString(1, medico.getMedidentificador());
            pst.setString(2, medico.getMednombres());
            pst.setString(3, medico.getMedapellido());
            pst.setString(4, medico.getMedfecha());
            pst.setString(5, medico.getMedgenero());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Medico Registrado");

        } catch (SQLException ex) {
            Logger.getLogger(GestorMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
//            medicos.add(medico);
    }

    public LinkedList<Medico> getMedicobyParametro(int parametro, String valor) {
        LinkedList<Medico> resultado = new LinkedList<Medico>();
        String sql = "";
        //  for (Medico med : medicos) {
        switch (parametro) {
            case 1:
                // if (med.getMedidentificador().equals(valor)) {
                sql = "select * from medicos where MedIdentificador='" + valor + "'";
                // }
                // resultado.add(med);
                break;
            case 2:
                // if (med.getMednombres().equals(valor)) {
                sql = "select * from medicos where MedNombres='" + valor + "'";
                //}
                //resultado.add(med);
                break;
            case 3:
                //if (med.getMedapellido().equals(valor)) {
                sql = "select * from medicos where MedApellidos='" + valor + "'";
                //}
                //resultado.add(med);
                break;
            case 4:
                //if (med.getMedgenero().equals(valor)) {
                sql = "select * from medicos where MedGenero='" + valor + "'";
                //}
                //resultado.add(med);
                break;
        }

        try {
            Statement st = con.createStatement();
            ResultSet rsj = st.executeQuery(sql);
            while (rsj.next()) {
                String identificacion =rsj.getString("MedIdentificador");
                String nombres = rsj.getString("MedNombres");
                String apellidos = rsj.getString("MedApellidos");
                String fechaNacimiento = rsj.getString("Medfecha");
                String genero = rsj.getString("MedGenero");
                Medico medico = new Medico(identificacion, nombres, apellidos, fechaNacimiento, genero);

                resultado.add(new Medico(identificacion, nombres, apellidos, fechaNacimiento, genero));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

            
        }
        return resultado;
    }
}