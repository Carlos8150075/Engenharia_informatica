/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.Iterator;
import Exceptions.*;

/**
 *
 * @author Bernardo
 */
public interface ListADT<T> extends Iterable<T>{
    public T removeFirst() throws EmptyCollectionException;
    public T removeLast() throws EmptyCollectionException;
    public T remove(T element) throws ElementNotFoundException;
    public T first() throws EmptyCollectionException;
    public T last() throws EmptyCollectionException;
    public boolean contains(T target);
    public boolean isEmpty();
    public int size();
    @Override
    public Iterator<T> iterator();
    @Override
    public String toString();
}
