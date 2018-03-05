/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.lang.Object;
import Interfaces.StackADT;
import Exceptions.EmptyCollectionException;
/**
 *
 * @author Bernardo
 * @param <T>
 */
public class ArrayStack<T> implements StackADT<T>{
    private final int DEFAULT_CAPACITY = 100;
    private int top;
    private T[] stack;
    
    public ArrayStack(){
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }
    
    public ArrayStack(int inicialCapacity){
        top = 0;
        stack = (T[]) (new Object[inicialCapacity]);
    }
    
    @Override
    public void push(T element) {
        if(size() == stack.length)
            expandCapacity();
        
        stack[top] = element;
        top++;
        
    }

    @Override
    public T pop() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Stack");
        
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    @Override
    public T peek() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Stack");
        
        return stack[top-1];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public String toSting() {
        String ss = "";
        for(int i = 0; i<size();i++){
            ss += "ELEMENT #" + i + " "+ stack[i].toString() + "\n";
        }
        return ss;
    }

    private void expandCapacity() {
        int new_length = stack.length *2;
        T[] tempArray;
        tempArray = (T[]) (new Object[new_length]);
        for(int i = 0; i< stack.length; i++){
            stack[i] = tempArray[i];
        }
        
    }
    
}
