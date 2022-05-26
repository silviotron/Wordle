/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.silvio.motores;

/**
 *
 * @author silvi
 */
public class MotorTest implements IMotor {

    @Override
    public boolean checkPalabra(String s) {
        return true;
    }

    @Override
    public String obtenerPalabraAleatoria() {
        return "CICLO";
    }

    @Override
    public boolean add(String s) {
        return true;
    }

    @Override
    public boolean remove(String s) {
        return true;
    }

}
