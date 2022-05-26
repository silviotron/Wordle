/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.daw1.silvio.motores;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author silvi
 */
public class MotorBD implements IMotor {

    private String lang;
    private static final String URL = "jdbc:sqlite:data/dbwordle.db";

    public MotorBD(String lang) {
        this.lang = lang;
    }

    @Override
    public boolean checkPalabra(String s) {
        String palabra = null;
        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement ps = conn.prepareStatement("SELECT palabra FROM palabras WHERE lang = ? AND palabra = ?")) {
            ps.setString(1, lang);
            ps.setString(2, s.toUpperCase());
            try ( ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    palabra = rs.getString("palabra");
                }
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        if (palabra == null) {
            return false;
        } else {
            return palabra.equalsIgnoreCase(s);
        }
    }

    @Override
    public String obtenerPalabraAleatoria() {
        String palabra = "XXXXX";
        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement ps = conn.prepareStatement("SELECT palabra FROM palabras WHERE lang = ? ORDER BY RANDOM() LIMIT 1")) {
            ps.setString(1, lang);
            try ( ResultSet rs = ps.executeQuery()) {
                palabra = rs.getString("palabra");

            }

        } catch (SQLException ex) {
            Logger.getLogger(MotorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return palabra;
    }

    @Override
    public boolean add(String s) {
        int ejecutado = 0;
        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement ps = conn.prepareStatement("INSERT INTO palabras (palabra, lang) VALUES(?, ?)")) {
            ps.setString(1, s.toUpperCase().trim());
            ps.setString(2, lang);
            ejecutado = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MotorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ejecutado >= 1;
    }

    @Override
    public boolean remove(String s) {
        int ejecutado = 0;
        try ( Connection conn = DriverManager.getConnection(URL);  PreparedStatement ps = conn.prepareStatement("DELETE FROM palabras WHERE palabra = ?")) {
            ps.setString(1, s.toUpperCase().trim());
            ejecutado = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MotorBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ejecutado > 0;
    }

}
