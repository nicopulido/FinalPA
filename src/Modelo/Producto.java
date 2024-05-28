package Modelo;

public class Producto {

    private static int ultimoId = 0;
    private String nombre;
    private Proveedor proveedor;
    private int existencias;
    private int idProducto;

    public Producto() {
    }
    
    //Constructor de producto para la aplicación
    public Producto(String nombre, Proveedor proveedor) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.existencias = 0;
        this.idProducto = ++Producto.ultimoId;
    }
    
    //constructor de producto para la base de datos
    public Producto(String nombre, Proveedor proveedor, int existencias, int idProducto) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.existencias = existencias;
        this.idProducto = idProducto;
        if (idProducto > Producto.ultimoId) {
            ultimoId = idProducto;
        }
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
