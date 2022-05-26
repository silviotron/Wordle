/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.silvio.motores;

import java.sql.*;

/**
 *
 * @author silvi
 */
public class MotorBD implements IMotor{
    private String lang;
    private static final String URL = "jdbc:sqlite:data/dbwordle.db";
    
    public MotorBD(String lang) {
        this.lang = lang;
    }

    
    @Override
    public boolean checkPalabra(String s) {
        return true;
    }

    @Override
    public String obtenerPalabraAleatoria() {
        return "AAAAA";
    }

    @Override
    public boolean add(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
