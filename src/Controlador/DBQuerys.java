package Controlador;

import Modelo.Cliente;
import Modelo.Proveedor;
import Modelo.Producto;

import Constants.Constants;

import java.sql.*;

public class DBQuerys {

    ResultSet resultSet;

    // SELECT TODOS LOS PRODUCTOS
    public void allProducts() {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            Statement getProductos = connection.createStatement();
            resultSet = getProductos.executeQuery("SELECT * FROM " + Constants.DB_TABLE_PRODUCTOS);

            System.out.println("ID | CODIGO | NOMBRE | CANTIDAD | PROVEEDOR |");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id_producto") + " - ");
                System.out.print(resultSet.getInt("cod") + " - ");
                System.out.print(resultSet.getString("nombre") + " - ");
                System.out.print(resultSet.getString("cantidad") + " - ");
                System.out.println(resultSet.getString("proveedor"));
            }

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
    }

    // SELECT TODOS LOS CLIENTES
    public void allClientes() {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            Statement getClientes = connection.createStatement();
            resultSet = getClientes.executeQuery("SELECT * FROM " + Constants.DB_TABLE_CLIENTES);

            if (resultSet.isBeforeFirst()) {
                System.out.println("ID | CC |  NOMBRE |");
                while (resultSet.next()) {
                    System.out.print(resultSet.getInt("id_cliente") + " - ");
                    System.out.print(resultSet.getString("cc") + " - ");
                    System.out.println(resultSet.getString("nombre"));
                }
            }

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
    }

    // SELECT TODOS LOS PROVEEDORES
    public void allProveedores() {
        try {
            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);

            Statement getProveedores = connection.createStatement();
            resultSet = getProveedores.executeQuery("SELECT * FROM " + Constants.DB_TABLE_PROVEEDORES);

            System.out.println("ID | NIT |  NOMBRE |");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id_proveedor") + " - ");
                System.out.print(resultSet.getInt("NIT") + " - ");
                System.out.println(resultSet.getString("nombre"));
            }

        } catch (SQLException e) {
            System.out.println("Error: ");
            System.out.println(e.getMessage());
        }
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

            resultSet = buscarProducto.executeQuery();
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

            resultSet = buscarProducto.executeQuery();
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
//    public void buscarProveedorNombre(String nombre){
//        try {
//            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);
//
//            PreparedStatement buscarProducto = connection.prepareStatement("SELECT * FROM " + Constants.DB_TABLE_PROVEEDORES + " WHERE nombre = ?");
//            buscarProducto.setString(1, nombre);
//
//            resultSet = buscarProducto.executeQuery();
//            if (resultSet.isBeforeFirst()){
//                System.out.println("ID | NIT |  NOMBRE |");
//                while (resultSet.next()) {
//                    System.out.print(resultSet.getInt("id_proveedor") + " - ");
//                    System.out.print(resultSet.getInt("NIT") + " - ");
//                    System.out.println(resultSet.getString("nombre"));
//                }
//            } else {
//                System.out.println("No se encontró el producto");
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Error: ");
//            System.out.println(e.getMessage());
//        }
//    }
//
//    // BUSCAR PRODUCTO POR NIT
//    public void buscarProveedorNIT(int nit){
//        try {
//            Connection connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);
//
//            PreparedStatement buscarProducto = connection.prepareStatement("SELECT * FROM " + Constants.DB_TABLE_PROVEEDORES + " WHERE NIT = ?");
//            buscarProducto.setInt(1, nit);
//
//            resultSet = buscarProducto.executeQuery();
//            // El if sirve para comprobar si el result devolvió algo (una row)
//            if (resultSet.isBeforeFirst()){
//                System.out.println("ID | NIT |  NOMBRE |");
//                while (resultSet.next()) {
//                    System.out.print(resultSet.getInt("id_proveedor") + " - ");
//                    System.out.print(resultSet.getInt("NIT") + " - ");
//                    System.out.println(resultSet.getString("nombre"));
//                }
//            } else {
//                System.out.println("No se encontró el producto");
//            }
//
//
//        } catch (SQLException e) {
//            System.out.println("Error: ");
//            System.out.println(e.getMessage());
//        }
//    }

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
