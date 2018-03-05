/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_f07;


/**
 *
 * @author Bernardo
 * @param <T>
 */
public class Node <T>{
    private T object;
    private Node<T> next;

    public Node(T object) {
        this.object = object;
        this.next = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    public boolean hasNext(){
        return next!=null;
    }
}
