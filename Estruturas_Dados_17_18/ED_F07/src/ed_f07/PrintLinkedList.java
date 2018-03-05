/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_f07;

/**
 *
 * @author Bernardo
 */
public class PrintLinkedList {
    public static void printLL(Node l){
        if(l == null){
            return;
        }else{
            System.out.println(l.getObject());
            printLL(l.getNext());
        }
    }
}
