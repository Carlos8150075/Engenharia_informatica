/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Interfaces.*;
import Exceptions.*;
/**
 *
 * @author Bernardo
 */
public class ArrayUnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T>{

    
    public ArrayUnorderedList(){
        super();
    }
    
    public ArrayUnorderedList(int inicialCapacity){
        super(inicialCapacity);
    }
    
    @Override
    public void addToFront(T element) {
        if(size() == list.length){
            expandCapacity();
        }
        for(int i = rear; i > 0; i++ ){
            list[i] = list[i-1];
        }
        list[0] = element;
        rear++;
    }

    @Override
    public void addToRear(T element) {
        if(size() == list.length){
            expandCapacity();
        }
        list[rear] = element;
        rear++;
    }

    @Override
    public void addAfter(T element, T target) throws ElementNotFoundException{
        if(size() == list.length){
            expandCapacity();
        }
        int i = 0;
        while(i < rear && !target.equals(list[i])){
            i++;
        }
        if(i == rear){
            throw new ElementNotFoundException("List");
        }
        i++;
        for(int j = rear; j > i; j--){
            list[j] = list[j-1];
        }
        list[i] = element;
        rear++;
    }

    
    
}
