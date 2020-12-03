package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import recursos.*;

public class GestorMedico {

    public static LinkedList<Medico> medicos;
    private static Connection con;

    public GestorMedico() {
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
    }

    public void RegistrarMedicos(Medico medico) {
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("INSERT INTO medicos (MedIdentificador, MedNombres, MedApellidos, Medfecha, MedGenero) VALUES (?, ?, ?, ?, ?)");
            pst.setString(1, medico.getMednombres());
            pst.setString(2, medico.getMedapellido());
            pst.setString(3, medico.getMedidentificador());
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
        LinkedList<Medico> resulta = new LinkedList<Medico>();
        String sql = "";
        for (Medico med : medicos) {
            switch (parametro) {
                case 1:
                    if (med.getMedidentificador().equals(valor)) {
                        sql = "select * from medicos where MedIdentificador" + valor + " ";
                    }
                    resulta.add(med);
                    break;
                case 2:
                    if (med.getMednombres().equals(valor)) {
                        sql = "select * from medicos where MedNombres" + valor + " ";
                    }
                    resulta.add(med);
                    break;
                case 3:
                    if (med.getMedapellido().equals(valor)) {
                        sql = "select * from medicos where MedApellidos" + valor + " ";
                    }
                    resulta.add(med);
                    break;
                case 4:
                    if (med.getMedgenero().equals(valor)) {
                        sql = "select * from medicos where MedGenero" + valor + " ";
                    }
                    resulta.add(med);
                    break;
            }

        }
        return null;
    }
}
    

