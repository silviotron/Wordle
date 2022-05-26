/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.silvio.motores;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class MotorArchivo implements IMotor {

    public static String ruta = Path.of(".") + File.separator + "data" + File.separator + "diccionario.dat";
    public static File archivo = new File(ruta);
    private static Set<String> diccionario;

    public MotorArchivo() {
        if (!archivo.exists()) {
            archivo.getParentFile().mkdirs();
            try {
                archivo.createNewFile();
            } catch (IOException iOException) {
            }
        }
        if (!archivo.exists()) {
            archivo.getParentFile().mkdirs();
            try {
                archivo.createNewFile();
            } catch (IOException iOException) {
            }
            try ( OutputStream os = new BufferedOutputStream(new FileOutputStream(archivo));  ObjectOutputStream out = new ObjectOutputStream(os)) {
                out.writeObject(diccionario);
            } catch (Exception e) {
            }
        } else {
            try ( InputStream is = new BufferedInputStream(new FileInputStream(archivo));  ObjectInputStream di = new ObjectInputStream(is)) {
                diccionario = (HashSet<String>) di.readObject();
            } catch (Exception e) {
            }

        }

    }

    @Override
    public boolean add(String s) {
        if (diccionario.add(s)) {
            try ( OutputStream os = new BufferedOutputStream(new FileOutputStream(archivo));  ObjectOutputStream out = new ObjectOutputStream(os)) {
                out.writeObject(diccionario);
            } catch (Exception e) {
            }
            return true;
        } else {
            return false;

        }
    }

    @Override
    public boolean remove(String s) {
        if (diccionario.remove(s)) {
            try ( OutputStream os = new BufferedOutputStream(new FileOutputStream(archivo));  ObjectOutputStream out = new ObjectOutputStream(os)) {
                out.writeObject(diccionario);
            } catch (Exception e) {
            }
            return true;
        } else {
            return false;

        }
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
        if (!diccionario.isEmpty()) {
            String[] array = diccionario.toArray(new String[diccionario.size()]);
            return array[(int) (Math.random() * diccionario.size())]; 
        }
        return null;
   }

}
