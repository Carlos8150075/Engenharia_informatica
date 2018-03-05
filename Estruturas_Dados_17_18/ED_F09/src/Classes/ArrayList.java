/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Interfaces.ListADT;
import java.util.Iterator;
import Exceptions.*;
/**
 *
 * @author Bernardo
 */
public class ArrayList<T> implements ListADT<T>{
    
    protected final int DEFAULT_CAPACITY = 100;
    protected int rear;
    protected T[] list;
    
    public ArrayList(){
        rear = 0;
        list = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public ArrayList(int inicialCapacity){
        rear = 0;
        list = (T[]) (new Object[inicialCapacity]);
    }
    
    
    @Override
    public T removeFirst() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("List");
        T old_elem = list[0];
        rear--;
        for(int i = 0; i < rear; i++){
            list[i] = list[i+1];
        }
        list[rear] = null;
        return old_elem;
    }

    @Override
    public T removeLast() throws EmptyCollectionException{
        T old_elem;
        if(isEmpty())
            throw new EmptyCollectionException("List"); 
        rear--;
        old_elem = list[rear];
        list[rear] = null;
        return old_elem;
    }

    @Override
    public T remove(T element) throws ElementNotFoundException{
        T old_elem;
        int pos = find(element);
        
        if(pos == -1){
            throw new ElementNotFoundException("List");
        }
        
        old_elem = list[pos];
        rear--;
        for(int i = 0; i < rear; i++){
            list[i] = list[i+1];
        }
        list[rear] = null;
        return old_elem;
    }

    @Override
    public T first() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("List");
        return list[0];
    }

    @Override
    public T last() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("List");
        return list[rear -1];
    }

    @Override
    public boolean contains(T target) {
        return (find(target) != -1);
    }

    @Override
    public boolean isEmpty() {
        return (rear == 0);
    }

    @Override
    public int size() {
        return rear;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(list, rear);
    }
 
    private int find(T target){
        int i = 0, result = -1;
        boolean found = false;
        if(!(isEmpty()))
            while(!found && i < rear){
                if(target.equals(list[i])){
                    found = true;
                }else{
                    i++;
                }
            }
        if(found){
            result = i;
        }
        return result;
    }
    
    protected void expandCapacity(){
        T[] temp = (T[]) (new Object[list.length * 2]);
        for(int i = 0; i < list.length; i++){
            temp[i] = list[i];
        }
        
        temp = list;
    }
    
    @Override
    public String toString(){
        StringBuffer result = new StringBuffer("");
        for(int i = 0; i < list.length; i++){
            result.append(list[i].toString());
            result.append("\n");
        }
        return result.toString();
    }
}
