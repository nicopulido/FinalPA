package Modelo;

public class Producto {

    private static int ultimoId = 0;
    private int cod;
    private String nombre;
    private Proveedor proveedor;
    private int cantidad;
    private int idProducto;

    public Producto() {
    }
    
    //Constructor de producto para la aplicación
    public Producto(String nombre, Proveedor proveedor) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.cantidad = 0;
        this.idProducto = ++Producto.ultimoId;
    }
    
    //constructor de producto para la base de datos
    public Producto(int codigo, String nombre, Proveedor proveedor, int cantidad, int idProducto) {
        this.cod = codigo;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        if (idProducto > Producto.ultimoId) {
            ultimoId = idProducto;
        }
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
}
