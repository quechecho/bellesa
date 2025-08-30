package modelo;

public class Nodo {
    private String documento;
    private String nombre;
    private String apellido;
    private String voto;

    public Nodo izquierda;
    public Nodo derecha;

    public Nodo(String documento, String nombre, String apellido, String voto) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.voto = voto;
        this.izquierda = null;
        this.derecha = null;
    }

    // Getters y Setters
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }
}

