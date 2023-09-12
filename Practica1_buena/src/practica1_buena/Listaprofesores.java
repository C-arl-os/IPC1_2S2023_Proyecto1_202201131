/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_buena;

import com.sun.source.tree.TryTree;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author sanci
 */
public class Listaprofesores implements Serializable{
    ArrayList<Profesor> Profesor;
    ArrayList<Cursos> Cursos;
    ArrayList<Alumnos> Alumno;
    ArrayList<Actividades> actividad;

    public Listaprofesores(ArrayList<Profesor> Profesor, ArrayList<Cursos> Cursos, ArrayList<Alumnos> Alumno, ArrayList<Actividades> actividad) {
        this.Profesor = Profesor;
        this.Cursos = Cursos;
        this.Alumno = Alumno;
        this.actividad = actividad;
    }

   
    
    

    public Listaprofesores(ArrayList<Profesor> Profesor,ArrayList<Cursos> Cursos,ArrayList<Alumnos> Alumno) {
        this.Profesor = Profesor;
        this.Cursos = Cursos;
        this.Alumno = Alumno;
    }
    public Listaprofesores() {
        this.Profesor = Profesor;
        this.Alumno = Alumno;
        this.Cursos = Cursos;
    }

    public  Listaprofesores(ArrayList<Cursos> Cursos) {
        this.Cursos = Cursos;
        
    }

    public ArrayList<Cursos> getCursos() {
        return Cursos;
    }

    public void setCursos(ArrayList<Cursos> Cursos) {
        this.Cursos = Cursos;
    }
    

    public ArrayList<Profesor> getProfesor() {
        return Profesor;
    }

    public void setProfesor(ArrayList<Profesor> Profesor) {
        this.Profesor = Profesor;
    }
     public ArrayList<Alumnos> getAlumno() {
        return Alumno;
    }

    public void setAlumno(ArrayList<Alumnos> Alumno) {
        this.Alumno = Alumno;
        
    }
    

    
    
}
