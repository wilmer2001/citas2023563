package modelo;

public class Paciente {

    private String identificador;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String sexo;

    public Paciente(String identificador, String nombres, String apellidos, String fechaNacimiento, String sexo) {
        this.identificador = identificador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
