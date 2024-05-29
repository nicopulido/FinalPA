package Modelo;

public class Proveedor {
    private int NIT;
    private String nombre;

    public Proveedor() {
    }

    public Proveedor(int NIT, String nombre) {
        this.NIT = NIT;
        this.nombre = nombre;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
