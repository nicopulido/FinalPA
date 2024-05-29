package Controlador;

import Modelo.Cliente;

import java.sql.*;

public class Main {
        public static void main(String[] args) {
            DBQuerys si = new DBQuerys();
            Cliente cliente = new Cliente(9875, "Nicolas", 0);
            si.insertCliente(cliente);
            ResultSet result = si.allClientes();
            System.out.println("result = " + result);
        }
    }
