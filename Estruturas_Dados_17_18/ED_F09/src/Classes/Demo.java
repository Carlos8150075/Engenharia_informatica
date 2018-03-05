/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import Interfaces.*;
import java.util.Iterator;

/**
 *
 * @author Bernardo
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ElementNotFoundException, EmptyCollectionException {
        HeapADT<Pessoa> bst = new LinkedHeap<>();
        Pessoa p1 = new Pessoa("Rui", 30);
        Pessoa p2 = new Pessoa("Carlos", 15);
        Pessoa p3 = new Pessoa("Ana", 31);
        Pessoa p4 = new Pessoa("Antonio", 34);
        Pessoa p5 = new Pessoa("André", 20);
        Pessoa p6 = new Pessoa("Gabriel", 8);

        bst.addElement(p1);
        bst.addElement(p2);
        bst.addElement(p3);
        bst.addElement(p4);
        bst.addElement(p5);
        bst.addElement(p6);
        
        
        
        
        bst.removeMin();
        System.out.println("Inicio Impressão");
        Iterator it = bst.iteratorInOrder();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }

}
