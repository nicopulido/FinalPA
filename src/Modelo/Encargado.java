package Modelo;

public class Encargado {
    private String nombre;
    private String usuario;
    private String pin;

    public Encargado() {
    }

    public Encargado(String nombre, String usuario, String pin) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.pin = pin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
}
