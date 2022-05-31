package Modelo;

public class Cliente {
    private String referencia;
    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private String Municipio;
    private String Barrio;
    private String Sexo;
    private String Estrato;

    public Cliente(String referencia, String Cedula, String Nombres, String Apellidos, String Municipio, String Barrio,
            String Sexo, String Estrato) {
        this.referencia = referencia;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Municipio = Municipio;
        this.Barrio = Barrio;
        // this.Sexo = Sexo;
        this.Estrato = Estrato;
    }

    public Cliente() {
        this.referencia = "";
        this.Cedula = "";
        this.Nombres = "";
        this.Apellidos = "";
        this.Municipio = "";
        this.Barrio = "";
        // this.Sexo = "";
        this.Estrato = "";
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String barrio) {
        Barrio = barrio;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getEstrato() {
        return Estrato;
    }

    public void setEstrato(String estrato) {
        Estrato = estrato;
    }
}
