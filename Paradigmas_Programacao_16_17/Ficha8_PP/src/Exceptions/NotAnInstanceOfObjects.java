/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Bernardo
 */
public class NotAnInstanceOfObjects extends Exception{

    public NotAnInstanceOfObjects() {
        
    }

    public NotAnInstanceOfObjects(String string) {
        super(string);
    }
}
