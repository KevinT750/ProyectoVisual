package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL {

    // ATRIBUTO INICIO DE SESION EN MYSQL
    Connection cn;

    // METODO DE CONEXION
    public Connection conectar() {
        try {
            // Cargar la nueva clase del controlador (com.mysql.cj.jdbc.Driver)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Realizar la conexión
            cn = DriverManager.getConnection("jdbc:mysql://localhost/usuario?autoReconnect=true&useSSL=false", "root", "Holagerman1.");
            System.out.println("CONECTADO a la base de datos Conexion");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Imprime la traza de excepción completa
            System.out.println("Error al cargar el controlador JDBC");
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime la traza de excepción completa
            System.out.println("ERROR DE CONEXION BD");
        }
        return cn;
    }
}
