/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_buena;

import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.stream.Stream;


public class CS {
    List<Profesor> personas = new ArrayList<>();
    public void leer(String bf) {
        String csvFile = "C:\\Users\\sanci\\Desktop\\pr\\IPC1_2S2023_Proyecto1_202201131\\Practica1_buena\\Archivos\\PRUEVA.csv"; // Reemplaza con la ruta de tu archivo CSV
        List<Profesor> personas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line;
            boolean firstLine = true; // Para ignorar la primera línea (encabezados)

            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue; // Saltar la primera línea
                }
                System.out.println("a");
                String[] parts = line.split(";");
                if (parts.length == 5) {
                    System.out.println("a");
                    String Codigo = (String)parts[0].trim();
                    String nombre = parts[1].trim();
                    String Apellido = parts[2].trim();
                    String Correo = parts[3].trim();
                    String Genero = parts[4].trim();
                    Profesor persona = new Profesor(Codigo,nombre,Apellido,Correo,Genero);
                    personas.add(persona);
                                System.out.println("Nombre: " + personas.get(0).getNombre() + ", Edad: " + persona.getApellido()+ ", Ciudad: " + persona.getCodigo());
                                System.out.println("a");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("aaa");
        }

        // Ahora, el ArrayList "personas" contiene objetos Persona con los datos del CSV.
        for (Profesor persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getApellido()+ ", Ciudad: " + persona.getCodigo());
        }
        
    }
    
    
        
}
