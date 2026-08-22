package barian;

public class Objeto {
    private String nombre;
    private String tipo;
    private int nivel;
    private String descripcion;
    private String rareza;
    public Objeto(String nombre, String tipo, int nivel, String descripcion, String rareza){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.descripcion = descripcion;
        this.rareza = rareza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }
}
