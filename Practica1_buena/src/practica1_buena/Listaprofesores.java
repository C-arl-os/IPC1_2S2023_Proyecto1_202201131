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
public class Listaprofesores implements Serializable{
    ArrayList<Profesor> Profesor;

    public Listaprofesores(ArrayList<Profesor> Profesor) {
        this.Profesor = Profesor;
    }
    public Listaprofesores() {
        this.Profesor = Profesor;
    }

    public ArrayList<Profesor> getProfesor() {
        return Profesor;
    }

    public void setProfesor(ArrayList<Profesor> Profesor) {
        this.Profesor = Profesor;
    }
    
    
}
