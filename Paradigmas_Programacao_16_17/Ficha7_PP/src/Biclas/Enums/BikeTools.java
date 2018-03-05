/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biclas.Enums;

/**
 *
 * @author Bernardo
 */
public enum BikeTools {
    BOTTLE, KIT, FLASHLIGHT;
    
    public static String ToolsToString (BikeTools t){
       switch(t){
           case BOTTLE:
               return "Garrafa";
           case KIT:
               return "Kit";
           case FLASHLIGHT:
               return "Lanterna";
           default:
               return "Sem extra";
       }
    }
    
}

