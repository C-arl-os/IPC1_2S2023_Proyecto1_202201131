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
public class Cursos implements Serializable{
    String Codigo;
    String Nombre;
    String Creditos;
    String Alumnos;
    String Profesor;

    public Cursos(String Codigo, String Nombre, String Creditos, String Alumnos, String Profesor) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Creditos = Creditos;
        this.Alumnos = Alumnos;
        this.Profesor = Profesor;
    }

    public Cursos() {
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

    public String getCreditos() {
        return Creditos;
    }

    public void setCreditos(String Creditos) {
        this.Creditos = Creditos;
    }

    public String getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(String Alumnos) {
        this.Alumnos = Alumnos;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }
    
    
}
