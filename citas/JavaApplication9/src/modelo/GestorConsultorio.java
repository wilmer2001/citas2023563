
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




public class GestorConsultorio {
    
    
        private static LinkedList<Consultorio> consultorios;
        private static Connection con;
        
        public GestorConsultorio() {
        Conexion conexion = new Conexion();
        con = conexion.getConnection();
        consultorios = new LinkedList<Consultorio>();
         
    }
        public void RegistrarConsulorioDB(Consultorio consultorio){
             PreparedStatement pst;
        try {
            pst = con.prepareStatement("INSERT INTO consultorios (conIdentificador,conNombre) VALUES (?, ?)");
            pst.setString(1, consultorio.getConIdentificador());
            pst.setString(2, consultorio.getConNombre());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Consultorio Registrado");

        } catch (SQLException ex){
            Logger.getLogger(GestorConsultorio.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
         public LinkedList<Consultorio> getConsultoriobyParametro(int parametro, String Buscador) {
        LinkedList<Consultorio> resultado = new LinkedList<Consultorio>();
        String sql = "";
        
        switch (parametro) {
            case 1:
                // if (Con.getConIdentificador().equals(Buscador)) {
                sql = "select * from consultorios where ConIdentificador='" + Buscador + "'";
                // }
                // resultado.add(Con);
                break;
            case 2:
                // if (Con.getConNombre().equals(Buscador)) {
                sql = "select * from Consultorios where ConNombre='" + Buscador + "'";
                //}
                //resultado.add(Con);
                break;
                
                 }

        try {
            Statement st = con.createStatement();
            ResultSet rsj = st.executeQuery(sql);
            while (rsj.next()) {
                String NumeroConsultorio =rsj.getString("ConIdentificador");
                String NombresConsultorio = rsj.getString("ConNombre");

                Consultorio consultorio = new Consultorio(NumeroConsultorio, NombresConsultorio);

                resultado.add(new Consultorio(NumeroConsultorio, NombresConsultorio));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

            
        }
        return resultado;
    }
  
}
    
    
    
    
