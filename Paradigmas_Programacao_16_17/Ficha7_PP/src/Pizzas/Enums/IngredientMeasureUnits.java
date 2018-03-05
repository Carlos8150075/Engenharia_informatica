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
public enum IngredientMeasureUnits {
    GRAMAS,LITROS, UNIDADES;
    
    public static String IngredientMeasureUnitsToString(IngredientMeasureUnits m){
        switch(m){
            case GRAMAS:
                return "Gramas";
            case LITROS:
                return "Litros";
            case UNIDADES:
                return "Unidades";
            default:
                return "Não definido";
        }
    }
}
