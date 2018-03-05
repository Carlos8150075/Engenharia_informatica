/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Exceptions.*;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public interface BinarySearchTreeADT<T> extends BinaryTreeADT<T>{
    public void addElement(T element);
    public T removeElement(T targetElement) throws ElementNotFoundException;
    public void removeAllOccurrences(T targetElement) throws ElementNotFoundException;
    public T removeMin() throws EmptyCollectionException;
    public T removeMax();
    public T findMin() throws EmptyCollectionException;
    public T findMax();
}
