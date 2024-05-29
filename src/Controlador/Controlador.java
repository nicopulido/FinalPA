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

    public Controlador(){
        //desde el principio se obtienen los datos de la base de datos
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

    public void crearProducto(String nombre, Proveedor proveedor) {
        Producto producto = new Producto(nombre, proveedor);
        this.bodega.getProductos().add(producto);
        //método para dejar el producto en la base de datos
    }

    public void modificarNombreProducto(String nombre, Producto productoAModificar) {
        this.bodega.getProductos().get(this.bodega.getProductos().indexOf(productoAModificar)).setNombre(nombre);
        //método para morificar producto en la base de datos
    }
    
    public void modificarProveedorProducto(Proveedor proveedor, Producto productoAModificar){
        this.bodega.getProductos().get(this.bodega.getProductos().indexOf(productoAModificar)).setProveedor(proveedor);
        //método para morificar producto en la base de datos
    }
    
    public void modificarExistenciasProducto(int existencias, Producto productoAModificar){
        this.bodega.getProductos().get(this.bodega.getProductos().indexOf(productoAModificar)).setCantidad(existencias);
        //método para morificar producto en la base de datos
    }
    
    /*public void ingresarClientes(nombre){
        Cliente(nombre) cliente;
        this.clientes.add(cliente)
        persistencia.insertCliente(Cliente)
    }
    
    public arrayList<Cliente>(Resultset x){
        new array list
    }
    */
    public ArrayList<Producto> obtenerProductos(){
        return this.bodega.getProductos();
    }

    public ArrayList<Cliente> obtenerClientes() {
        return this.clientes;
    }

    public ArrayList<Proveedor> obtenerProveedores() {
        return this.proveedores;
    }
    
    
}
