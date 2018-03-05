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
public enum BaseType {
    FINA,ALTA;
    
    public static String BaseTypeToString(BaseType t){
        switch(t){
            case FINA:
                return "Massa Fina";
            case ALTA:
                return "Massa Alta";
            default:
                return "Não definido";
        }
    }
}
