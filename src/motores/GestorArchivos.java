/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motores;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

//.replaceAll("Á", "A").replaceAll("É", "E").replaceAll("Í", "I").replaceAll("Ó", "O").replaceAll("Ú", "Ú"));                    
/**
 *
 * @author alumno
 */
public class GestorArchivos {

    public static Set<String> values(File f) {
        Set<String> set = new HashSet<>();
        if (!f.exists()) {
            return new HashSet<>();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(f))){  
            String s = reader.readLine().trim().toUpperCase();
            while(s != null){
                set.add(s.trim().toUpperCase());
                s = reader.readLine();
            }
            System.out.println("");

        } catch (IOException ex) {}
        return set;
    }
    
    public static Set<String> values(File f,int length) {
        Set<String> set = new HashSet<>();
        if (!f.exists()) {
            return new HashSet<>();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(f))){  
            String linea = reader.readLine().trim().toUpperCase();
            while(linea != null){
                for (String s : linea.split(" +")) {
                    if (s.trim().length() == length) {
                        set.add(s.trim().toUpperCase());
                    }
                }                
                linea = reader.readLine();
            }

        } catch (IOException ex) {}
        return set;
    }
    
    public static Set<String> values(File f,int length, boolean b) {
        Set<String> set = new HashSet<>();
        if (!f.exists()) {
            return new HashSet<>();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(f))){  
            String linea = reader.readLine().trim().toUpperCase();
            while(linea != null){
                for (String s : linea.split(" +")) {
                    if (s.trim().length() == length) {
                        if (b) {
                            s = s.replaceAll("Á", "A").replaceAll("É", "E").replaceAll("Í", "I").replaceAll("Ó", "O").replaceAll("Ú", "Ú");
                        }
                        set.add(s.trim().toUpperCase());
                    }
                                       
                }
                linea = reader.readLine(); 

            }

        } catch (IOException ex) {}
        return set;
    }    
    
    public static void add(File f, String s){
        checkArchivo(f);        
        try(BufferedWriter br = new BufferedWriter(new FileWriter(f))){  
            br.write(s);
            br.newLine();
        } catch (IOException ex) {}        
    }
    public static void add(File f, Set<String> set){
        checkArchivo(f);        
        try(BufferedWriter br = new BufferedWriter(new FileWriter(f))){  
            for (String s : set) {
                br.write(s);
                br.newLine();                
            }
        } catch (IOException ex) {}        
    }
    public static void add(File f, String[] array){
        checkArchivo(f);
        try(BufferedWriter br = new BufferedWriter(new FileWriter(f))){  
            for (String s : array) {
                br.write(s);
                br.newLine();                
            }
        } catch (IOException ex) {}        
    }
    
    public static void checkArchivo(File f){
        if (!f.exists()) {
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            } catch (IOException iOException){}
        }        
    }
}
