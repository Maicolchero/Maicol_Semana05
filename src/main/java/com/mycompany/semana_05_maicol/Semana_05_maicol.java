/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana_05_maicol;

import modelo.Conexion;
import vista.Vista;

/**
 *
 * @author Maicol
 */
public class Semana_05_maicol {


    
   public static void main(String args[]) {

       Conexion conexion = new Conexion();
       conexion.getConnection();
       
try {
    // Set HiFi Look and Feel from JTattoo
    javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
} catch (ClassNotFoundException ex) {
    java.util.logging.Logger.getLogger(Semana_05_maicol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
    java.util.logging.Logger.getLogger(Semana_05_maicol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
    java.util.logging.Logger.getLogger(Semana_05_maicol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(Semana_05_maicol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
}