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
public interface HeapADT<T extends Comparable<T>> extends BinaryTreeADT<T>{
    public void addElement(T obj);
    public T removeMin() throws EmptyCollectionException;
    public T findMin();
}
