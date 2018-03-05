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
public interface QueueADT<T> {
    public void enqueue(T element);
    public T dequeue();
    public T first();
    public boolean isEmpty();
    public int size();
    @Override
    public String toString();
}
