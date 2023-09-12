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
public class Actividades implements Serializable{
    String Codigo;
    String nombre;
    String Descripcion;
    String Ponderacion;
    String Promedio;
    String CodigoAlumni;

    public Actividades() {
    }

    public Actividades(String Codigo, String nombre, String Descripcion, String Ponderacion, String Promedio, String CodigoAlumni) {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.Ponderacion = Ponderacion;
        this.Promedio = Promedio;
        this.CodigoAlumni = CodigoAlumni;
    }

    public String getCodigoAlumni() {
        return CodigoAlumni;
    }

    public void setCodigoAlumni(String CodigoAlumni) {
        this.CodigoAlumni = CodigoAlumni;
    }

    public Actividades(String Codigo, String nombre, String Descripcion, String Ponderacion, String Promedio) {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.Ponderacion = Ponderacion;
        this.Promedio = Promedio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPonderacion() {
        return Ponderacion;
    }

    public void setPonderacion(String Ponderacion) {
        this.Ponderacion = Ponderacion;
    }

    public String getPromedio() {
        return Promedio;
    }

    public void setPromedio(String Promedio) {
        this.Promedio = Promedio;
    }
    
    
    
    
}
