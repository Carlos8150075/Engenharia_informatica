/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_f02;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class DoubleNode<T> {
    private T object;
    private DoubleNode<T> next;
    private DoubleNode<T> previous;
    
    public DoubleNode(T object){
        this.object = object;
        this.next = null;
        this.previous = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    public DoubleNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode<T> previous) {
        this.previous = previous;
    }

    
    
    public boolean hasNext(){
        return next!=null;
    }
}
