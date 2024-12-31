package com.mycompany.intento3;
/**
 *
 * @author Pablo Tapia
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Conexión con el servidor Xampp
    private static final String URL = "jdbc:mysql://localhost:3306/evaluacion2";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
    }
    // aqui prueba la conexión (lo ejecute en el main solo) si funciona
    public static void testConnection() {
        try (Connection conexion = getConnection()) {
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
