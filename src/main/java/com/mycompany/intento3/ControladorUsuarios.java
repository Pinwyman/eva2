package com.mycompany.intento3;
/**
 *
 * @author Pablo Tapia
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorUsuarios {
    // Método para verificar el login
    public boolean login(String usuario, String contraseña) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?";
        try (Connection conexion = Conexion.getConnection();
             PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, usuario);
            statement.setString(2, contraseña);
            // Ejecuta la consulta
            try (ResultSet resultado = statement.executeQuery()) {
                // Si hay al menos un registro, el login es válido
                return resultado.next();
            }
        } catch (SQLException e) {
            System.err.println("Error al realizar la consulta: " + e.getMessage());
        }
        return false; // Retorna false si hay algún error o no coincide el usuario
    }
}