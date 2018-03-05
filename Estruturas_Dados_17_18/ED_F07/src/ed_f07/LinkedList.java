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
public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int count;
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void add(T elem) {
        Node new_elem = new Node(elem);
        if (head == null) {
            head = new_elem;
            count++;
        } else {
            Node<T> temp = head;
            while(temp.hasNext()){
                temp = temp.getNext();
            }
            temp.setNext(new_elem); //diz ao "programa" que elem será proximo da lista
            count++;
        }
    }

    public boolean remove(T elem){
        Node<T> temp = head;
        while(temp.getNext() != elem){
            temp = temp.getNext();
        }
        temp.setNext((temp.getNext()).getNext());
        count--;
        return true;
    }
    public int exist(T elem) {
        Node<T> it = head;
        int pos = 0;
        while (it != null && it.getObject().equals(elem)) {
            it = it.getNext();
            pos++;
        }
        if (it == null) {
            return -1;
        } else {
            return pos;
        }

    }
    public void printAll(){
        Node<T> temp = head;
        
        while(temp.hasNext()){
            System.out.println(temp);
            temp = temp.getNext();
        }
        System.out.println(temp);
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
    
}
