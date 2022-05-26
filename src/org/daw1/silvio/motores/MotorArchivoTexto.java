/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.silvio.motores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class MotorArchivoTexto implements IMotor {

    public static String ruta = Path.of(".") + File.separator + "data" + File.separator + "diccionario.txt";
    public static File archivo = new File(ruta);
    private static Set<String> diccionario;

    public MotorArchivoTexto() {
        if (!archivo.exists()) {
            archivo.getParentFile().mkdirs();
            try {
                archivo.createNewFile();
            } catch (IOException iOException) {
            }
        }
        this.diccionario = values(archivo, 5);
        System.out.println("");
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

    @Override
    public boolean add(String s) {
        if (!diccionario.contains(s)) {
            guardar(archivo, s);
            diccionario.add(s);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(String s) {
        if (diccionario.contains(s)) {
            diccionario.remove(s);
            guardar(archivo, diccionario);
            return true;
        }
        return false;
    }

    public static Set<String> values(File f, int length) {
        Set<String> set = new LinkedHashSet<>();
        if (!f.exists()) {
            return new HashSet<>();
        }
        try ( BufferedReader reader = new BufferedReader(new FileReader(f))) {
            String linea = reader.readLine().trim().toUpperCase().replaceAll("Á", "A").replaceAll("É", "E").replaceAll("Í", "I").replaceAll("Ó", "O").replaceAll("Ú", "Ú");
            while (linea != null) {
                if (linea.trim().length() == length) {
                    set.add(linea.trim().toUpperCase());
                }

                linea = reader.readLine();
            }

        } catch (IOException ex) {
        }
        return set;
    }

    public static void guardar(File f, Set<String> set) {
        checkArchivo(f);
        try ( BufferedWriter br = new BufferedWriter(new FileWriter(f))) {
            for (String s : set) {
                br.write(s);
                br.newLine();
            }
        } catch (IOException ex) {
        }
    }

    public static void guardar(File f, String s) {
        checkArchivo(f);
        try ( BufferedWriter br = new BufferedWriter(new FileWriter(f))) {
            br.write(s);
            br.newLine();
        } catch (IOException ex) {
        }
    }

    public static void checkArchivo(File f) {
        if (!f.exists()) {
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            } catch (IOException iOException) {
            }
        }
    }

}
