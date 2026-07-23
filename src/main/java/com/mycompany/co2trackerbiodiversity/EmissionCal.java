/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.co2trackerbiodiversity;

/**
 *
 * @author 35385
 */
public class EmissionCal {
    private static final double Petrol = 0.163;
    private static final double Diesel = 0.173;
    private static final double Electric = 0.05;
    private static final double Bus = 0.104;
    private static final double Train = 0.046;
    private static final double Dart = 0.028;
    
    public static double calculate(String mode, double distanceKM){
        double factor = getFactor(mode);
        double distanceKm = 0;
        return factor * distanceKm;
    }
    
    public static double getFactor(String mode){
        switch(mode.toLowerCase()){
            case "petrol":
                return Petrol;
            case "diesel":
                return Diesel;
            case "electric":
                return Electric;
            case "bus":
                return Bus;
            case "train":
                return Train;
            case "dart":
                return Dart;
            default:
                return 0.0;
        }
    }
}
