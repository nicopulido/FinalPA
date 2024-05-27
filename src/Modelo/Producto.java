package Modelo;

public class Producto {
    private String nombre;
    private Proveedor proveedor;
    private int existencias;
    private int idProducto;

    public Producto() {
    }

    public Producto(String nombre, Proveedor proveedor) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.existencias = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
}
