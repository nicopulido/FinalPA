package Controlador;

import Modelo.Cliente;
import Modelo.Proveedor;
import Modelo.Producto;

import Constants.Constants;

import java.sql.*;
import java.util.ArrayList;

public class DBQuerys {


    // SELECT TODOS LOS PRODUCTOS
    public ArrayList<Producto> allProducts() {
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            Statement getProductos = connection.createStatement();
            ResultSet resultSet = getProductos.executeQuery("SELECT * FROM " + Constants.DB_TABLE_PRODUCTOS);

            //System.out.println("ID | CODIGO | NOMBRE | CANTIDAD | PROVEEDOR |");
            while (resultSet.next()) {
                /*System.out.print(resultSet.getInt("id_producto") + " - ");
                System.out.print(resultSet.getInt("cod") + " - ");
                System.out.print(resultSet.getString("nombre") + " - ");
                System.out.print(resultSet.getInt("cantidad") + " - ");
                System.out.println(resultSet.getString("proveedor"));
*/
                String nombre = resultSet.getString("nombre");
                int cod = resultSet.getInt("cod");
                int idProducto = resultSet.getInt("id_producto");
                int cantidad = resultSet.getInt("cantidad");
                String nombreProveedor = resultSet.getString("proveedor");
                Proveedor proveedor = this.buscarProveedorNombre(nombreProveedor);
                Producto producto = new Producto(cod, nombre, proveedor, cantidad, idProducto);
                productos.add(producto);
            }

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
        return productos;
    }

    // SELECT TODOS LOS CLIENTES
    public ArrayList<Cliente> allClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            Statement getClientes = connection.createStatement();
            ResultSet resultSet = getClientes.executeQuery("SELECT * FROM " + Constants.DB_TABLE_CLIENTES);

            if (resultSet.isBeforeFirst()) {
                System.out.println("ID | CC |  NOMBRE |");
                while (resultSet.next()) {
                    System.out.print(resultSet.getInt("id_cliente") + " - ");
                    System.out.print(resultSet.getInt("cc") + " - ");
                    System.out.println(resultSet.getString("nombre"));
                    int idCliente = resultSet.getInt("id_cliente");
                    int cc = resultSet.getInt("cc");
                    String nombre = resultSet.getString("nombre");
                    Cliente cliente = new Cliente(cc, nombre, idCliente);
                    clientes.add(cliente);
                }
            }

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
        return clientes;
    }

    // SELECT TODOS LOS PROVEEDORES
    public ArrayList<Proveedor> allProveedores() {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            Statement getProveedores = connection.createStatement();
            ResultSet resultSet = getProveedores.executeQuery("SELECT * FROM " + Constants.DB_TABLE_PROVEEDORES);

            System.out.println("ID | NIT |  NOMBRE |");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id_proveedor") + " - ");
                System.out.print(resultSet.getInt("NIT") + " - ");
                System.out.println(resultSet.getString("nombre"));
                String nombre = resultSet.getString("nombre");
                int NIT = resultSet.getInt("NIT") ;
                int idProveedor = resultSet.getInt("id_proveedor");
                Proveedor proveedor = new Proveedor(NIT, nombre, idProveedor);
                proveedores.add(proveedor);
            }

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
        return proveedores;
    }

    // INGRESAR PRODCUTO A LA BASE DE DATOS
    public void insertProducto(Producto product) {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            PreparedStatement ingresarProducto = connection.prepareStatement("INSERT INTO " + (Constants.DB_TABLE_PRODUCTOS + "(cod, nombre, cantidad, proveedor) " + "VALUES(?,?,?,?)"));
            insertProveedor(product.getProveedor());

            ingresarProducto.setInt(1, product.getCod());
            ingresarProducto.setString(2, product.getNombre());
            ingresarProducto.setInt(3, product.getCantidad());
            ingresarProducto.setString(4, product.getProveedor().getNombre());

            ingresarProducto.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
    }

    // INGRESAR PROVEEDOR A LA BASE DE DATOS
    public void insertProveedor(Proveedor proveedor) {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            PreparedStatement ingresarProveedor = connection.prepareStatement("INSERT INTO " + (Constants.DB_TABLE_PROVEEDORES + "(NIT, nombre) " + "VALUES(?,?)"));

            ingresarProveedor.setInt(1, proveedor.getNIT());
            ingresarProveedor.setString(2, proveedor.getNombre());

            ingresarProveedor.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
    }

    // INGRESAR CLIENTE A LA BASE DE DATOS
    public void insertCliente(Cliente cliente) {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            PreparedStatement ingresarCliente = connection.prepareStatement("INSERT INTO " + (Constants.DB_TABLE_CLIENTES + "(cc, nombre) " + "VALUES(?,?)"));

            ingresarCliente.setInt(1, cliente.getCc());
            ingresarCliente.setString(2, cliente.getNombre());

            ingresarCliente.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
    }

    // BUSCAR PRODUCTO POR NOMBRE
    public void buscarProductoNombre(String nombre) {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            PreparedStatement buscarProducto = connection.prepareStatement("SELECT * FROM " + Constants.DB_TABLE_PRODUCTOS + " WHERE nombre = ?");
            buscarProducto.setString(1, nombre);

            ResultSet resultSet = buscarProducto.executeQuery();
            if (resultSet.isBeforeFirst()) {
                while (resultSet.next()) {
                    System.out.print(resultSet.getInt("id_producto") + " - ");
                    System.out.print(resultSet.getInt("cod") + " - ");
                    System.out.print(resultSet.getString("nombre") + " - ");
                    System.out.print(resultSet.getString("cantidad") + " - ");
                    System.out.println(resultSet.getString("proveedor"));
                }
            } else {
                System.out.println("No hay productos con ese nombre");
            }

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
    }

    // BUSCAR PRODUCTO POR CODIGO
    public void buscarProductoCod(int codigo) {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            PreparedStatement buscarProducto = connection.prepareStatement("SELECT * FROM " + Constants.DB_TABLE_PRODUCTOS + " WHERE cod = ?");
            buscarProducto.setInt(1, codigo);

            ResultSet resultSet = buscarProducto.executeQuery();
            if (resultSet.isBeforeFirst()) {
                while (resultSet.next()) {
                    System.out.print(resultSet.getInt("id_producto") + " - ");
                    System.out.print(resultSet.getInt("cod") + " - ");
                    System.out.print(resultSet.getString("nombre") + " - ");
                    System.out.print(resultSet.getString("cantidad") + " - ");
                    System.out.println(resultSet.getString("proveedor"));
                }
            } else {
                System.out.println("No hay productos con ese código");
            }

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
    }

//     BUSCAR PROVEEDOR POR NOMBRE
    public Proveedor buscarProveedorNombre(String nombre) {
        Proveedor proveedor = new Proveedor(0, "", 0);
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            PreparedStatement buscarProducto = connection.prepareStatement("SELECT * FROM " + Constants.DB_TABLE_PROVEEDORES + " WHERE nombre = ?");
            buscarProducto.setString(1, nombre);

            ResultSet resultSet = buscarProducto.executeQuery();
            if (resultSet.isBeforeFirst()) {
                //System.out.println("ID | NIT |  NOMBRE |");
                while (resultSet.next()) {
                    /*System.out.print(resultSet.getInt("id_proveedor") + " - ");
                    System.out.print(resultSet.getInt("NIT") + " - ");
                    System.out.println(resultSet.getString("nombre"));*/
                    proveedor.setNIT(resultSet.getInt("NIT"));
                    proveedor.setIdProveedor(resultSet.getInt("id_proveedor"));
                    proveedor.setNombre(resultSet.getString("nombre"));
                }
            } else {
                System.out.println("No se encontró el producto");
            }

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
        return proveedor;
    }

    // BUSCAR PRODUCTO POR NIT
    public void buscarProveedorNIT(int nit) {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            PreparedStatement buscarProducto = connection.prepareStatement("SELECT * FROM " + Constants.DB_TABLE_PROVEEDORES + " WHERE NIT = ?");
            buscarProducto.setInt(1, nit);

            ResultSet resultSet = buscarProducto.executeQuery();
            // El if sirve para comprobar si el result devolvió algo (una row)
            if (resultSet.isBeforeFirst()) {
                System.out.println("ID | NIT |  NOMBRE |");
                while (resultSet.next()) {
                    System.out.print(resultSet.getInt("id_proveedor") + " - ");
                    System.out.print(resultSet.getInt("NIT") + " - ");
                    System.out.println(resultSet.getString("nombre"));
                }
            } else {
                System.out.println("No se encontró el producto");
            }

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
    }

    // EDITAR NOMBRE DEL PRODUCTO
    public void editarNombreProducto(String nombre, int codigo) {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            PreparedStatement buscarProducto = connection.prepareStatement("UPDATE " + Constants.DB_TABLE_PRODUCTOS + " SET nombre = ? WHERE cod = ?");
            buscarProducto.setString(1, nombre);
            buscarProducto.setInt(2, codigo);

            buscarProducto.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
    }

    // EDITAR CANTIDAD DEL PRODUCTO
    public void editarCantidadProducto(int codigo, int cantidad) {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            PreparedStatement buscarProducto = connection.prepareStatement("UPDATE " + Constants.DB_TABLE_PRODUCTOS + " SET cantidad = ? WHERE cod = ?");
            buscarProducto.setInt(1, cantidad);
            buscarProducto.setInt(2, codigo);

            buscarProducto.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
    }
}
