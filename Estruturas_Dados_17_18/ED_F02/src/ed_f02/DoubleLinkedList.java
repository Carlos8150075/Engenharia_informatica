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
public class DoubleLinkedList<T> {

    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public DoubleNode<T> getTail() {
        return tail;
    }

    public void setTail(DoubleNode<T> tail) {
        this.tail = tail;
    }

    public DoubleNode<T> getHead() {
        return head;
    }

    public void setHead(DoubleNode<T> head) {
        this.head = head;
    }

    public void addOnHead(T elem) {
        DoubleNode new_elem = new DoubleNode(elem);
        head.setPrevious(new_elem);
        new_elem.setNext(head);
        setHead(new_elem);
    }

    public void removeFirst() { 
        if (!(isEmpty())) {
            head = head.getNext();
            head.setPrevious(null);
        }

    }

    public void removeLast() {
        tail = tail.getPrevious();
        tail.setNext(null);
    }

    public boolean isEmpty() {
        return tail == null && head == null;
    }

}
