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
public enum MountainBikeSuspension {
    SIMPLE, DOUBLE, NONE;

    public static String SuspensionToString(MountainBikeSuspension s) {
        switch (s) {
            case SIMPLE:
                return "Simples";
            case DOUBLE:
                return "Dupla";
            case NONE:
                return "Nenhuma";
            default:
                return "Nenhuma";
        }
    }
}
