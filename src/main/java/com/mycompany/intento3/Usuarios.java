package com.mycompany.intento3;
/**

 * @author Pablo Tapia
 */
public class Usuarios {
    public String usuario;
    public String contraseña;

    public Usuarios(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
 }
