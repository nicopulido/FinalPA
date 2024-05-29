package Modelo;

public class Proveedor {
    private int NIT;
    private String nombre;
    private int idProveedor;

    public Proveedor() {
    }

    public Proveedor(int NIT, String nombre, int idProveedor) {
        this.NIT = NIT;
        this.nombre = nombre;
        this.idProveedor = idProveedor;
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

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Proveedor{");
        sb.append("NIT=").append(NIT);
        sb.append(", nombre=").append(nombre);
        sb.append(", idProveedor=").append(idProveedor);
        sb.append('}');
        return sb.toString();
    }
    
    
}
