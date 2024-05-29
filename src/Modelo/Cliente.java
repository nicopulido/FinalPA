package Modelo;

public class Cliente {
    private int cc;
    private String nombre;
    private int cantidad;

    public Cliente(int cc, String nombre, int cantidad) {
        this.cc = cc;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Cliente() {
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
