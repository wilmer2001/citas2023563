package modelo;

public class Medico {
     private String medidentificador;
    private String mednombres;
    private String medapellido;
    private String medfecha;
    private String medgenero;

    public Medico(String medidentificador, String mednombres, String medapellido, String medfecha, String medgenero) {
        this.medidentificador = medidentificador;
        this.mednombres = mednombres;
        this.medapellido = medapellido;
        this.medfecha = medfecha;
        this.medgenero = medgenero;
    
}

    public String getMedidentificador() {
        return medidentificador;
    }

    public void setMedidentificador(String medidentificador) {
        this.medidentificador = medidentificador;
    }

    public String getMednombres() {
        return mednombres;
    }

    public void setMednombres(String mednombres) {
        this.mednombres = mednombres;
    }

    public String getMedapellido() {
        return medapellido;
    }

    public void setMedapellido(String medapellido) {
        this.medapellido = medapellido;
    }

    public String getMedfecha() {
        return medfecha;
    }

    public void setMedfecha(String medfecha) {
        this.medfecha = medfecha;
    }

    public String getMedgenero() {
        return medgenero;
    }

    public void setMedgenero(String medgenero) {
        this.medgenero = medgenero;
    }
}
  
