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
    public void Inicio(ArrayList<Profesor> prof,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno, ArrayList<Actividades> actividad){
        Login login = new Login(prof,curso,Alumno,actividad);
        
        login.setTitle("Bienvenido");
        login.setResizable(false);
        login.setLocationRelativeTo(login);
        login.setVisible(true);
    }
    //conector
    public void administrador(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno,ArrayList<Actividades> actividad){
        Administrador admin = new Administrador( Profe,curso,Alumno,actividad);
        
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
    public void ventanaCrearPro(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno,ArrayList<Actividades> actividad){
        CrearProfe crear = new CrearProfe(Profe,curso,Alumno,actividad);
        
       crear.setTitle("Crear Profe");
        crear.setResizable(false);
        crear.setLocationRelativeTo(crear);
        crear.setVisible(true);
    }
    
    //acutalizar Profesor
    public void ActualizarProfe(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno,ArrayList<Actividades> actividad){
        ActualizarProfe actu = new ActualizarProfe(Profe,curso,Alumno,actividad);
        actu.setTitle("Actualizar Porfesor");
        actu.setResizable(false);
        actu.setLocationRelativeTo(actu);
        actu.setVisible(true);
    }
    
    //ventana eliminar
    public void EliminarProfesor(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno,ArrayList<Actividades> actividad){
        EliminarProfe eliminar = new EliminarProfe(Profe,curso,Alumno,actividad);
        eliminar.setTitle("Eliminar Profesoer");
        eliminar.setResizable(false);
        eliminar.setLocationRelativeTo(eliminar);
        eliminar.setVisible(true);
    }
    
   //crear cursos 
    public void CrearCursos(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno,ArrayList<Actividades> actividad){
        CrearClases eliminar = new CrearClases(Profe,curso,Alumno,actividad);
        eliminar.setTitle("Crear Clase");
        eliminar.setResizable(false);
        eliminar.setLocationRelativeTo(eliminar);
        eliminar.setVisible(true);
    }
    //modificar cursos
    public void ModificarCursos(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno,ArrayList<Actividades> actividad){
        ActualizarClase MdCursos = new ActualizarClase(Profe,curso,Alumno,actividad);
        MdCursos.setTitle("Modificar Cursos");
        MdCursos.setResizable(false);
        MdCursos.setLocationRelativeTo(MdCursos);
        MdCursos.setVisible(true);
    }
    //eliminar cursos
        public void EliminarCurso(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno,ArrayList<Actividades> actividad){
        EliminarClase MdCursos = new EliminarClase(Profe,curso,Alumno,actividad);
        MdCursos.setTitle("Eliminar Clase");
        MdCursos.setResizable(false);
        MdCursos.setLocationRelativeTo(MdCursos);
        MdCursos.setVisible(true);
    }
        
        //ventada de administrar el curso
        public void AdministrarCursos(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno, int indice,String indiceClase,ArrayList<Actividades> actividad){
        AdminitradordeCursos MdCursos = new AdminitradordeCursos(Profe,curso,Alumno,indice,indiceClase,actividad);
        MdCursos.setTitle("Admnintrar Curso");
        MdCursos.setResizable(false);
        MdCursos.setLocationRelativeTo(MdCursos);
        MdCursos.setVisible(true);
    }
        //ventana de profesor A Alumno
         public void MostrarDatos(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno, int indice,String indiceClase,ArrayList<Actividades> actividad,String codigo){
        VerInformacion MdCursos = new VerInformacion(Profe,curso,Alumno,indice,indiceClase,actividad,codigo);
        MdCursos.setTitle("Admnintrar Curso");
        MdCursos.setResizable(false);
        MdCursos.setLocationRelativeTo(MdCursos);
        MdCursos.setVisible(true);
        //modulo de Profesores
         }
    public void ModuloProfesores(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno, int indice,ArrayList<Actividades> actividad){
        ModuloProfesores MdCursos = new ModuloProfesores(Profe, curso, Alumno, indice,actividad);
        MdCursos.setTitle("Modulo Profesores Curso");
        MdCursos.setResizable(false);
        MdCursos.setLocationRelativeTo(MdCursos);
        MdCursos.setVisible(true);
    }
    
    //Actualizar El perfil del profesor presnte
    public void MiPerfirlProfesor(ArrayList<Profesor> Profe,ArrayList<Cursos> curso,ArrayList<Alumnos> Alumno, int indice,String nombre,ArrayList<Actividades> actividad){
        ACTProfesor MdCursos = new ACTProfesor(Profe,curso,Alumno,indice,nombre,actividad);
        MdCursos.setTitle("Mi Perfil");
        MdCursos.setResizable(false);
        MdCursos.setLocationRelativeTo(MdCursos);
        MdCursos.setVisible(true);
    }
    
}
