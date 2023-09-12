/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_buena;

import java.io.Serializable;
import java.util.ArrayList;

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
    String nota;
    String nombreestudiante;
    ArrayList<Alumnos> estudiante;
    ArrayList<Actividades> actividades;
   

    

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Cursos(String Codigo, String Nombre, String Creditos, String Alumnos, String Profesor, String nota) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Creditos = Creditos;
        this.Alumnos = Alumnos;
        this.Profesor = Profesor;
        this.nota = nota;
    }

    public Cursos(ArrayList<Alumnos> alumnos,ArrayList<Actividades> actividades) {
        this.estudiante = alumnos;
        this.actividades=this.actividades;
    }

    public ArrayList<Actividades> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividades> actividades) {
        this.actividades = actividades;
    }

    public Cursos(String Codigo, String Nombre, String Creditos, String Alumnos, String Profesor) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Creditos = Creditos;
        this.Alumnos = Alumnos;
        this.Profesor = Profesor;
    }

    public String getNombreestudiante() {
        return nombreestudiante;
    }

    public void setNombreestudiante(String nombreestudiante) {
        this.nombreestudiante = nombreestudiante;
    }

    public ArrayList<Alumnos> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(ArrayList<Alumnos> estudiante) {
        this.estudiante = estudiante;
    }

    public Cursos(String Codigo, String Profesor, String nota, String nombreestudiante) {
        this.Codigo = Codigo;
        this.Profesor = Profesor;
        this.nota = nota;
        this.nombreestudiante = nombreestudiante;
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
