/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_buena;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author sanci
 */
public class Binario {
     String descuentos;
    public Binario() {
        this.descuentos = "Archivos//Descuentos.bin";
    }
    
    public boolean guardar(Listaprofesores lista){
        try {
            FileOutputStream fos = new FileOutputStream(descuentos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Listaprofesores obtener(){
        Listaprofesores lista = new Listaprofesores();
        try {
            File f = new File(descuentos);
            if(f.exists()){
                FileInputStream fis = new FileInputStream(descuentos);
                ObjectInputStream ois = new ObjectInputStream(fis);
                lista = (Listaprofesores) ois.readObject();
                ois.close();
                fis.close();
            }
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "aa");
            
        } 
         return null;
    }
    
    
    
    
       
        

        
    






   
}
