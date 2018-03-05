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
public enum IngredientOrigin {
    NACIONAL, IMPORTADO;
    
    public static String IngredientOriginToString(IngredientOrigin o){
        switch(o){
            case NACIONAL:
                return "Nacional";
            case IMPORTADO:
                return "Importado";
            default:
                return "Não definido";
        }
    }
}
