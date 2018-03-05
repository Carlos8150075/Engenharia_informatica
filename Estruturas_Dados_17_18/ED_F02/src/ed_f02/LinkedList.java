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
public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Método que permite adicionar um elemento à lista
     * @param elem Elemento que irá ser adicionado
     */
    public void add(T elem) {
        Node new_elem = new Node(elem);
        if (head == null) {
            head = new_elem;
        } else {
            Node<T> temp = head;
            while(temp.hasNext()){
                temp = temp.getNext();
            }
            temp.setNext(new_elem); 
        }
    }
    /**
     * Método que permite remover um elemento à lista.
     * @param elem Elemento que se pretende remover 
     * @return Sucesso/Insucesso da operação
     */
    public boolean remove(T elem){
        Node<T> temp = head;
        while(temp.getNext() != elem){
            temp = temp.getNext();
        }
        temp.setNext((temp.getNext()).getNext());
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
    @Override
    public String toString(){
        Node<T> current = head;
        StringBuffer result = new StringBuffer("");
        
        while(current != null){
            result.append(current.getObject().toString());
            current = current.getNext();
        }
        return result.toString();
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
