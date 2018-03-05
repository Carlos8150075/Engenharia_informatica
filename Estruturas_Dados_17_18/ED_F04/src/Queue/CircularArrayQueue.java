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
public class CircularArrayQueue<T> implements QueueADT<T> {

    private final int DEFAULT_CAPACITY = 100;
    private int front;
    private int rear;
    private int count;
    private T[] queue;

    public CircularArrayQueue() {
        front = 0;
        rear = 0;
        count = 0;
        queue = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public CircularArrayQueue(int initialCapacity) {
        front = 0;
        rear = 0;
        count = 0;
        queue = (T[]) (new Object[initialCapacity]);
    }

    @Override
    public void enqueue(T element) {
        if (!(size() == queue.length)) {
            queue[rear] = element;
            rear = (rear + 1) % queue.length;
        } else {
            expandCapacity();
            queue[rear] = element;
        }
        count++;
    }

    @Override
    public T dequeue() {
        if (size() == 0) {
            System.out.println("Vazio");
            return null;
        } else {
            T old_elem = queue[front];
            front = (front + 1) % queue.length;
            count--;
            return old_elem;
        }

    }

    @Override
    public T first() {
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    public void expandCapacity() {
        int new_length = queue.length * 2;

        T[] tempArray;
        tempArray = (T[]) (new Object[new_length]);
        for (int i = 0; i < queue.length; i++) {
            tempArray[i] = queue[front];
            front = (front + 1) % queue.length;
        }
        front = 0;
        rear = queue.length;
        queue = tempArray;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer("");
        for(int i = 0; i<size(); i++){
            result.append(queue[i].toString());
            result.append("\n");
        }
        return result.toString();
    }
}
