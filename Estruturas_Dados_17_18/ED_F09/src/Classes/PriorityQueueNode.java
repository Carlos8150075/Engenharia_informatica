/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Bernardo
 */
public class PriorityQueueNode<T> implements Comparable<PriorityQueueNode>{

    private static int nextorder = 0;
    private int priority;
    private int order;
    private T element;
    
    
    public PriorityQueueNode(T obj, int prio){
        element = obj;
        priority = prio;
        order = nextorder;
        nextorder++;
    }
    
    /**
     * Retorna 1 se o nó atual tem uma prioridade maior que o nó dado e -1 caso contrario
     * @param obj Nó a comparar com este
     * @return O resultado da comparação do obj com o nó
     */
    @Override
    public int compareTo(PriorityQueueNode obj) {
        int result;
        PriorityQueueNode<T> temp = obj;
        if(priority > temp.getPriority())
            result = 1;
        else if(priority < temp.getPriority())
            result = -1;
        else if(order > getOrder())
            result = 1;
        else
            result = -1;
        return result;
    }

    public int getPriority() {
        return priority;
    }

    public int getOrder() {
        return order;
    }

    public T getElement() {
        return element;
    }

    @Override
    public String toString() {
        String temp = (element.toString() + priority + order);
        return temp;
    }
    
    
    
}
