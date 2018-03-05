/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas.Enums;

/**
 *
 * @author Bernardo
 */
public enum SeaFoodType {
    CAMARAO,LAGOSTA,CARANGUEJO,LULA;
    
    public static String SeaFoodToString(SeaFoodType t){
        switch(t){
            case CAMARAO:
                return "Camarão";
            case LAGOSTA:
                return "Lagosta";
            case CARANGUEJO:
                return "Caranguejo";
            case LULA:
                return "Lula";
            default:
                return "não definido";
        }
    }
}
