/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author hp
 */
public class Consultorio {
    private String conIdentificador;
    private String conNombre;

    public Consultorio(String conIdentificador, String conNombre) {
        this.conIdentificador = conIdentificador;
        this.conNombre = conNombre;
    }

    public String getConIdentificador() {
        return conIdentificador;
    }

    public void setConIdentificador(String conIdentificador) {
        this.conIdentificador = conIdentificador;
    }

    public String getConNombre() {
        return conNombre;
    }

    public void setConNombre(String conNombre) {
        this.conNombre = conNombre;
    }
    

    
   
    
}
