/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;

import java.util.ArrayList;
import java.util.Collection;
import javafx.print.Collation;

/**
 *
 * @author Bernardo
 */
public class Livraria<T extends Media>{
    
    private ArrayList<T> x;
    
    public Livraria(){
        x = new ArrayList<>();
    }

    public ArrayList<T> getX() {
        return x;
    }

    public void setX(ArrayList<T> x) {
        this.x = x;
    }
    
    public void printElement(Collection<?> c){
        for(Object e : c){
            System.out.println(e);
        }
    }
}
