package modelo.entidad;

public class Cliente {

    private String idClienteDniRuc;
    private String nombres;
    private String apellidos;
    private int sexo;
    private String celular;
    private String correo;

    public Cliente(String idClienteDniRuc, String nombres, String apellidos, int sexo, String celular, String correo) {
        this.idClienteDniRuc = idClienteDniRuc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.celular = celular;
        this.correo = correo;
    }

    public Cliente(String nombres, String apellidos, int sexo, String celular, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.celular = celular;
        this.correo = correo;
    }

    public Cliente() {
    }

    public String getIdClienteDniRuc() {
        return idClienteDniRuc;
    }

    public void setIdClienteDniRuc(String idClienteDniRuc) {
        this.idClienteDniRuc = idClienteDniRuc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
