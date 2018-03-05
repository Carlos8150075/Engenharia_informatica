/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedStack;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class LinkedStack<T> implements StackADT<T> {

    private int count;
    private LinearNode<T> top;

    public LinkedStack() {
        count = 0;
        top = null;
    }

    public LinearNode<T> getTop() {
        return top;
    }

    public void setTop(LinearNode<T> top) {
        this.top = top;
    }

    @Override
    public void push(T element) {
        LinearNode<T> new_elem = new LinearNode<>(element);
        
        new_elem.setNext(top);
        top = new_elem;
        count++;
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("Empty Stack");
        

        T old_elem = top.getElement();
        top = top.getNext();
        count--;
        return old_elem;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) 
            throw new EmptyCollectionException("Empty");
        
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer("");
        LinearNode<T> current = top;
        
        while(current != null){
            result.append(current.getElement());
            result.append("\n");
            current = current.getNext();
        }
        return result.toString();
    }

}
