package com.mycompany.intento3;
import java.util.Scanner;
/**este es una prueba de conexion con Jenkins 
 *
 * @author Pablo Tapia
 */
public class Main {
    public static void main(String[] args) {
        ControladorUsuarios controlador = new ControladorUsuarios();
       Scanner scanner = new Scanner(System.in);
        System.out.println("***Inicio de sesión***");
         System.out.println("----------------------");
        System.out.println("Ingrese el noombre de usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Cargando.........");
        System.out.println("Ingrese la contraseña del usuario: ");
        String contraseña = scanner.nextLine();
        System.out.println("Cargardo.........");
        // Valida el login
        if (controlador.login(usuario, contraseña)) {
            System.out.println("Login exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
        scanner.close();
    }
}
