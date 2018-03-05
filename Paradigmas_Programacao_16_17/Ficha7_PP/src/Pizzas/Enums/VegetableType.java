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
public enum VegetableType {
        TOMATE, CEBOLA, COGUMELOS;
        
        public static String VegetableTypeToString(VegetableType t){
            switch(t){
                case TOMATE:
                    return "Tomate";
                case CEBOLA:
                    return "Cebola";
                case COGUMELOS:
                    return "Cogumelos";
                default:
                    return "Não definido";
            }
        }
}
