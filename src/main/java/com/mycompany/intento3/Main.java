package com.mycompany.intento3;
import java.util.Scanner;
/**
 *
 * @author Pablo Tapia
 */
public class Main {
    public static void main(String[] args) {
        ControladorUsuarios controlador = new ControladorUsuarios();
       Scanner scanner = new Scanner(System.in);
        System.out.println("***Inicio de sesión***");
         System.out.println("----------------------");
        System.out.println("Ingrese el usuario: ");
        String usuario = scanner.nextLine();
        System.out.println(".........");
        System.out.println("Ingrese la contraseña: ");
        String contraseña = scanner.nextLine();
        System.out.println(".........");
        // Valida el login
        if (controlador.login(usuario, contraseña)) {
            System.out.println("Login exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
        scanner.close();
    }
}
