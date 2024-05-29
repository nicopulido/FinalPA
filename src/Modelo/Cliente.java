package Modelo;

public class Cliente {
    private int cc;
    private String nombre;
    private int idCliente;

    public Cliente(int cc, String nombre, int idCliente) {
        this.cc = cc;
        this.nombre = nombre;
        this.idCliente = this.idCliente; 
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

}
