/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_buena;
import java.util.ArrayList;
/**
 *
 * @author sanci
 */
public class ventanas {
    //inicio principal
    public void Inicio(){
        Login login = new Login();
        
        login.setTitle("Bienvenido");
        login.setResizable(false);
        login.setLocationRelativeTo(login);
        login.setVisible(true);
    }
    public void Inicio(Login log){
        Login login = new Login();
        
        login.setTitle("Bienvenido");
        login.setResizable(false);
        login.setLocationRelativeTo(login);
        login.setVisible(true);
    }
    // nuevo login para guardar array
    
    
    //inicio aguarda el array
    public void Inicio(ArrayList<Profesor> prof,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno){
        Login login = new Login(prof,curso,Alumno);
        
        login.setTitle("Bienvenido");
        login.setResizable(false);
        login.setLocationRelativeTo(login);
        login.setVisible(true);
    }
    //conector
    public void administrador(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno){
        Administrador admin = new Administrador( Profe,curso,Alumno);
        
        admin.setTitle("Administrador");
        admin.setResizable(false);
        admin.setLocationRelativeTo(admin);
        admin.setVisible(true);
    }
    //solo manda un array
    /*public void administrador(ArrayList<Profesor> Profe){
        Administrador admin = new Administrador( Profe);
        
        admin.setTitle("Administrador");
        admin.setResizable(false);
        admin.setLocationRelativeTo(admin);
        admin.setVisible(true);
    }*/
    //crear nuevo profesor
    public void ventanaCrearPro(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno){
        CrearProfe crear = new CrearProfe(Profe,curso,Alumno);
        
       crear.setTitle("Crear Profe");
        crear.setResizable(false);
        crear.setLocationRelativeTo(crear);
        crear.setVisible(true);
    }
    
    //acutalizar Profesor
    public void ActualizarProfe(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno){
        ActualizarProfe actu = new ActualizarProfe(Profe,curso,Alumno);
        actu.setTitle("Actualizar Porfesor");
        actu.setResizable(false);
        actu.setLocationRelativeTo(actu);
        actu.setVisible(true);
    }
    
    //ventana eliminar
    public void EliminarProfesor(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno){
        EliminarProfe eliminar = new EliminarProfe(Profe,curso,Alumno);
        eliminar.setTitle("Eliminar Profesoer");
        eliminar.setResizable(false);
        eliminar.setLocationRelativeTo(eliminar);
        eliminar.setVisible(true);
    }
}
