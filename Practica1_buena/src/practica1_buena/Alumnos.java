/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_buena;

import java.io.Serializable;

/**
 *
 * @author sanci
 */
public class Alumnos implements Serializable{
    private String Codigo;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Genero;
    private String contraseña;
    private String nota;

    public Alumnos(String Codigo) {
        this.Codigo = Codigo;
    }

    public Alumnos(String Codigo, String Nombre, String Apellido) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    
    public Alumnos(String Codigo, String Nombre, String Apellido, String Correo, String Genero,String contraseña) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Genero = Genero;
        this.contraseña=contraseña;
    }
    
    public Alumnos(String Codigo, String Nombre, String Apellido, String Correo, String Genero) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Genero = Genero;
        contraseña ="1234";
    }

    public Alumnos(String Codigo, String Nombre, String Apellido, String Correo, String Genero, String contraseña, String nota) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Genero = Genero;
        this.contraseña = contraseña;
        this.nota = nota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    public Alumnos() {
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
