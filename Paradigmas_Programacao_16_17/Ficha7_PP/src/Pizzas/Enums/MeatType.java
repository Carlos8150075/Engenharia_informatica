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
public enum MeatType {
    PORCO, VACA, SALAME;
    
    public static String MeatTypeToString (MeatType t){
        switch(t){
            case PORCO:
                return "Porco";
            case VACA:
                return "Vaca";
            case SALAME:
                return "Salame";
            default:
                return "Não definido";
        }
    }
}
