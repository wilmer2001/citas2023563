
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;


public class GestorConsultorioControl implements ActionListener{
    
    modelo.GestorConsultorio consultorioModelo;
    vista.ConsultarConsultorio consultarconsultoriovista;

    public GestorConsultorioControl(vista.ConsultarConsultorio consultarconsultoriovista) {
        this.consultarconsultoriovista = consultarconsultoriovista;
        consultorioModelo = new modelo.GestorConsultorio();
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel modelo;
        String Buscador = consultarconsultoriovista.TxtBuscador.getText();
        int parametro = 0;
        
        if(consultarconsultoriovista.RadNumeroConsultorio.isSelected()){
         parametro=1;
        }
        if(consultarconsultoriovista.RadNombreConsultorio.isSelected()){
         parametro=2;
        }
        LinkedList<modelo.Consultorio> 
        consultorio= consultorioModelo.getConsultoriobyParametro(parametro, Buscador);
        String registro[]=new String[5];
        
        String []Titulos = {"ConIdentificador", "ConNombre"};
        
        modelo=new DefaultTableModel();
        modelo.setColumnIdentifiers(Titulos);
        
        for(modelo.Consultorio c:consultorio){
            registro[0]=c.getConIdentificador();
            registro[1]=c.getConNombre();
            modelo.addRow(registro);
        }
        consultarconsultoriovista.TDatos.setModel(modelo);
       
                
    }
    
    
    
}
