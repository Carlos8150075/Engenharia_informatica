/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import ed_f03.EmptyCollectionException;
import ed_f03.StackADT;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class Ex_05<T> implements QueueADT<T> {

    QueueADT<T> q1;
    StackADT<T> s1;
    StackADT<T> s2;

    public Ex_05(QueueADT q1, StackADT s1, StackADT s2) {
        this.q1 = q1;
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void enqueue(T element) {
        try {
            while (s1.size() > 0) {
                s2.push(s1.pop());
            }
            s1.push(element);
            while(s2.size() < 0){
                s1.push(s2.pop());
            }
        } catch (EmptyCollectionException ex) {
            Logger.getLogger(Ex_05.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public T dequeue() {
        try {
            return s1.pop();
        } catch (EmptyCollectionException ex) {
            Logger.getLogger(Ex_05.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public T first() {
        try {
            return s1.peek();
        } catch (EmptyCollectionException ex) {
            Logger.getLogger(Ex_05.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return s1.size() == 0;
    }

    @Override
    public int size() {
        return s1.size();
    }

}
