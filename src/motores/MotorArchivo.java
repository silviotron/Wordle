/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motores;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class MotorArchivo implements IMotor {

    public static String ruta = Path.of(".") + File.separator + "data" + File.separator + "motorAlumnos.dat";
    public static File archivo = new File(ruta);
    public static String ruta2 = Path.of(".") + File.separator + "data" + File.separator + "diccionario.dat";
    public static File archivo2 = new File(ruta2);
    private static Set<String> diccionario;

    public MotorArchivo() {
        if (!archivo.exists()) {
            archivo.getParentFile().mkdirs();
            try {
                archivo.createNewFile();
            } catch (IOException iOException) {
            }
        }
        //diccionario = GestorArchivos.values(archivo, 5);
        if (!archivo2.exists()) {
            archivo2.getParentFile().mkdirs();
            try {
                archivo2.createNewFile();
            } catch (IOException iOException) {
            }
            try(OutputStream os = new BufferedOutputStream(new FileOutputStream(archivo2));
                ObjectOutputStream out = new ObjectOutputStream(os)){
                out.writeObject(GestorArchivos.values(archivo, 5));
            } catch (Exception e) {}
        }else{
            try (InputStream is = new BufferedInputStream(new FileInputStream(archivo2));
                ObjectInputStream di = new ObjectInputStream(is) ){
                diccionario = (HashSet<String>)di.readObject();
            } catch (Exception e) {}
            
        }        

    }

    public void add(String s) {
        GestorArchivos.add(archivo, s);
    }

    public void add(Set set) {
        GestorArchivos.add(archivo, set);
    }

    public void add(String[] array) {
        GestorArchivos.add(archivo, array);
    }

    @Override
    public boolean checkPalabra(String s) {
        if (diccionario.contains(s.toUpperCase())) {
            return true;
        }
        return false;
    }

    @Override
    public String obtenerPalabraAleatoria() {
        String[] array = diccionario.toArray(new String[diccionario.size()]);
        return array[(int) (Math.random() * diccionario.size())];
    }

}
