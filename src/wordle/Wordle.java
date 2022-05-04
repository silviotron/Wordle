/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

import gui.MainJFrame;
import motores.*;

/**
 *
 * @author silvi
 */
public class Wordle {
    public void lanzar(IMotor motor){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame(motor).setVisible(true);
            }
        });
    }
    
}
