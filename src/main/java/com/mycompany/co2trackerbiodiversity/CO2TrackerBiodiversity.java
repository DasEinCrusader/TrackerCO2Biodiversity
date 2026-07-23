/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.co2trackerbiodiversity;

import javax.swing.SwingUtilities;

/**
 *
 * @author 35385
 */
public class CO2TrackerBiodiversity {

    public static void main(String[] args) {
        System.out.println("Transport Calculator");
        System.out.println("___________________________________");
        
        SwingUtilities.invokeLater(() ->{
            new GUI().setVisible(true);
        });
        testConsole();
    }
    
    private static void testConsole(){
        System.out.println("\n Console Test:");
        System.out.println("___________________________________");
    }
}
