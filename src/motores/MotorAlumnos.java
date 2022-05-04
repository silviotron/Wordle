/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motores;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/**
 *
 * @author alumno
 */
public class MotorAlumnos implements IMotor {

    private static String[] alumnos = new String[]{
        "Acuña da Costa, Francisco",
        "Areal Alvite, Daniel",
        "Barros Zúñiga, Samuel",
        "Bastos Rey, Anxo",
        "Cabaleiro Silva, Ismael",
        "Juncal Abeledo, Marcos",
        "Martínez Ferreira, Xurxo",
        "Míguez Rodríguez, Aarón",
        "Navarrete Soliño, Juan Ignacio",
        "Novas Martínez, Silvio",
        "Orge Marri, Breixo Thomas",
        "Paz Lorenzo, José Ramón",
        "Rodrigues Bento, Gonçalo Rafael",
        "Rodríguez Domínguez, Jorge",
        "Rodríguez García, Alexandro",
        "Rodríguez Groba, Samuel",
        "Troncoso Pena, Adrián"
    };
    private static Set<String> diccionario;

    public MotorAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = alumnos[i].toUpperCase().replaceAll("Ñ", "N").replaceAll("Ç", "C").replaceAll("Á", "A").replaceAll("É", "E").replaceAll("Í", "I").replaceAll("Ó", "O").replaceAll("Ú", "U");
        }
        diccionario = new HashSet<>();
        for (String alumno : alumnos) {
            diccionario.add((alumno.replaceAll(".*, ", "").replaceAll(" .*", "") + "AAAAA").substring(0, 5));
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
        String[] array = diccionario.toArray(new String[diccionario.size()]);
        return new String(array[(int) (Math.random() * diccionario.size())]);
    }

}
