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
public enum CheeseType {
    MOZZARELA, SERRA, CHEDAR;
    
    public static String CheeseTypeToStrig(CheeseType t){
        switch(t){
            case MOZZARELA:
                return "Mozzarela";
            case SERRA:
                return "Serra";
            case CHEDAR:
                return "Chedar";
            default:
                return "Não definido";
        }
    }
}
