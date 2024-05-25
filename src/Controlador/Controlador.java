package Controlador;

import Modelo.Bodega;
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
    
}
