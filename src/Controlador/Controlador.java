package Controlador;

import Modelo.Bodega;
import Modelo.Encargado;
import Modelo.Producto;
import Modelo.Proveedor;
import Vista.Vista;

public class Controlador {
    private Bodega bodega;
    private ControladorPersistencia persistencia;
    private Vista vista;

    public Controlador() {
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public ControladorPersistencia getPersistencia() {
        return persistencia;
    }

    public void setPersistencia(ControladorPersistencia persistencia) {
        this.persistencia = persistencia;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }
    
    public void agregarProducto(String nombre, Proveedor proveedor){
        Producto producto = new Producto(nombre, proveedor);
        // lógica para agregar el producto a base de datos método (producto)
    }
    
    public void eliminarProducto(Producto producto){
        //lógica para eliminar el producto de la base de datos
    }
    
    public boolean verificarIngreso(String usuario, String pin){
        Encargado encargado = this.bodega.getEncargado();
        if(encargado.getUsuario() == usuario){
            return encargado.getPin() == pin;
        }
        return false;
    }
    
    
    
}
