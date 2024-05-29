package Controlador;

import Modelo.Bodega;
import Modelo.Cliente;
import Modelo.Encargado;
import Modelo.Producto;
import Modelo.Proveedor;
import Vista.Vista;
import java.util.ArrayList;

public class Controlador {

    private Bodega bodega;
    private DBQuerys persistencia;
    private Vista vista;
    private ArrayList<Cliente> clientes;
    private ArrayList<Proveedor> proveedores;

    public Controlador() {
        //desde el principio se obtienen los datos de la base de datos
        this.persistencia = new DBQuerys();
        this.bodega = new Bodega();
        this.proveedores = this.persistencia.allProveedores();
        Encargado encargado = new Encargado("Elton Tito", "prueba", "prueba");
        this.bodega.setEncargado(encargado);
        this.bodega.setDireccion("Carrera 7 # 40B - 53");
        this.bodega.setProductos(this.persistencia.allProducts());
        this.vista = new Vista(this);
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public DBQuerys getPersistencia() {
        return persistencia;
    }

    public void setPersistencia(DBQuerys persistencia) {
        this.persistencia = persistencia;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public boolean validarUsuario(String usuario, String pin) {
        Encargado encargado = this.bodega.getEncargado();
        return encargado.getUsuario().equals(usuario) && encargado.getPin().equals(pin);
    }
    
    public void crearProducto(int codigo, String nombre, int indexProveedor) {
        String nombreProveedor = this.proveedores.get(indexProveedor).getNombre();
        int NITProveedor = this.proveedores.get(indexProveedor).getNIT();
        int idProveedor = this.proveedores.get(indexProveedor).getIdProveedor();
        Proveedor proveedor = new Proveedor(NITProveedor, nombreProveedor, idProveedor);
        Producto producto = new Producto(codigo, nombre, proveedor);
        this.bodega.getProductos().add(producto);
        this.persistencia.insertProducto(producto);
    }
    
    //método para modificar el nombre del producto desde el index de la lista de productos
    public void modificarNombreProducto(String nombre, int indexProducto) {
        int codigoProducto = this.getBodega().getProductos().get(indexProducto).getCod();
        this.bodega.getProductos().get(indexProducto).setNombre(nombre);
        this.persistencia.editarNombreProducto(nombre, codigoProducto);
    }

    public void modificarExistenciasProducto(int existencias, int indexProducto) {
        int codigoProducto = this.getBodega().getProductos().get(indexProducto).getCod();
        this.bodega.getProductos().get(indexProducto).setCantidad(existencias);
        this.persistencia.editarCantidadProducto(codigoProducto, existencias);
    }

    public ArrayList<Producto> obtenerProductos() {
        return this.bodega.getProductos();
    }

    public ArrayList<Cliente> obtenerClientes() {
        return this.clientes;
    }

    public ArrayList<Proveedor> obtenerProveedores() {
        return this.proveedores;
    }

}
