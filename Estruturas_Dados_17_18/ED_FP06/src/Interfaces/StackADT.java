/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Exceptions.EmptyCollectionException;
/**
 *
 * @author Bernardo
 * @param <T>
 */
public interface StackADT<T> {
    public void push(T element);
    public T pop() throws EmptyCollectionException;
    public T peek() throws EmptyCollectionException;
    public boolean isEmpty();
    public int size();
    
    public String toSting();
}
