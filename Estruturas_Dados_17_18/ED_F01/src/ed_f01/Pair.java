/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_f01;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class Pair<T extends Comparable> { //Aceita qualquer classe desde que extenda a interface comparable

    private T first;
    private T second;

    public Pair() {
        
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T max() {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
