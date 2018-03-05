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
public class TamanhoPizza {
        public enum PizzaSize{
            SMALL, MEDIUM, BIG, KING
    }
    public static String PizzaSizeToString(PizzaSize size){
        switch(size){
            case SMALL:
                return "The Pizza is small";
            case MEDIUM:
                return "The Pizza is medium";
            case BIG:
                return "The Pizza is big";
            case KING:
                return "The Pizza is king";
            default:
                return "The Pizza is medium";
        }
    }
}
