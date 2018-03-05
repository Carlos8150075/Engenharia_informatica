/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class LinkedQueue<T> implements QueueADT<T> {

    LinearNode<T> front;
    LinearNode<T> rear;
    private int count;

    public LinkedQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    @Override
    public void enqueue(T element) {
        LinearNode new_elem = new LinearNode(element);
        if (size() == 0) {
            front = new_elem;
            rear = new_elem;
            count++;
        } else {
            rear.setNext(new_elem);
            rear = new_elem;
            count++;
        }

    }

    @Override
    public T dequeue() {
        T old_elem = front.getElement();
        front = front.getNext();
        count--;
        return old_elem;
    }

    @Override
    public T first() {
        return front.getElement();
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
    public String toString(){
        StringBuilder result = new StringBuilder("");
        LinearNode current = front;
        
        while(current != null){
            result.append(current.getElement().toString());
            current = current.getNext();
        }
        return result.toString();
    }
    
}
