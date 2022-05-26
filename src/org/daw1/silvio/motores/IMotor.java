/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.daw1.silvio.motores;

/**
 *
 * @author silvi
 */
public interface IMotor {

    public abstract boolean checkPalabra(String s);

    public abstract String obtenerPalabraAleatoria();

    public abstract boolean add(String s);

    public abstract boolean remove(String s);

}
