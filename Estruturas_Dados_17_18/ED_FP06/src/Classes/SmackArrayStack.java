/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Exceptions.EmptyCollectionException;
import Interfaces.SmackStackADT;
/**
 *
 * @author Bernardo
 */
public class SmackArrayStack<T> extends ArrayStack<T> implements SmackStackADT<T>{

    @Override
    public void push(T element) {
        super.push(element);
    }

    @Override
    public T pop() throws EmptyCollectionException {
        return super.pop();
    }

    @Override
    public T peek() throws EmptyCollectionException {
        return super.peek();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public T smack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //ELIMINAR O PRIMEIRO E PUXAR PARA TRAS
        
    }
    
}
