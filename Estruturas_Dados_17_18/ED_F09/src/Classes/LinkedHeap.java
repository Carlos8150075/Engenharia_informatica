/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.HeapADT;
import Exceptions.*;
/**
 *
 * @author Bernardo
 * @param <T>
 */
public class LinkedHeap<T extends Comparable<T>> extends LinkedBinarySearchTree<T> implements HeapADT<T>{

    public HeapNode<T> lastNode;
    
    public LinkedHeap(){
        super();
    }
    
    @Override
    public void addElement(T obj) {
        HeapNode<T> node = new HeapNode<>(obj);
        if(root == null)
            root = node;
        else{
            HeapNode<T> next_parent = getNextParentAdd();
            if(next_parent.left == null)
                next_parent.left = node;
            else
                next_parent.right = node;
            node.parent = next_parent;
        }
        lastNode = node;
        count++;
        if(count > 1)
            heapifyAdd();
    }

    @Override
    public T removeMin() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("Empty Heap");
        T min = root.getElement();
        if(count == 1){
            root = null;
            lastNode = null;
        }else{
            HeapNode<T> next_last = getNewLastNode();
            if(lastNode.parent.left == lastNode)
                lastNode.parent.left = null;
            else
                lastNode.parent.right = null;
            
            root.element = lastNode.element;
            lastNode = next_last;
            heapifyRemove();
        }
        count--;
        return min;
    }

    @Override
    public T findMin(){
        if(isEmpty())
            return null;
        return root.getElement();
    }
    /**
     * 
     * @return 
     */
    private HeapNode<T> getNextParentAdd(){
        HeapNode<T> result = lastNode;
        while((result != root) && (result.parent.left != result))
            result = result.parent;
        if(result != root)
            if(result.parent.right == null)
                result = result.parent;
            else{
                result = (HeapNode<T>)result.parent.right;
                while(result.left != null)
                    result = (HeapNode<T>)result.left;
            }
        else
            while(result.left != null)
                result = (HeapNode<T>)result.left;
        return result;
    }
    
    private void heapifyAdd(){
        T temp;
        HeapNode<T> next = lastNode;
        
        temp = next.getElement();
        while((next != root) && (((Comparable)temp).compareTo(next.parent.getElement())<0)){
            next.element = next.parent.element;
            next = next.parent;
        }
        next.setElement(temp); 
    }
    
    private HeapNode<T> getNewLastNode(){
        HeapNode<T> result = lastNode;
        while((result != null) && (result.parent.left == result))
            result = result.parent;
        if(result != null)
            result = (HeapNode<T>)result.parent.left;
        while(result.right != null)
            result = (HeapNode<T>)result.right;
        
        return result;
    }
    
    private void heapifyRemove(){
        T temp;
        HeapNode<T> node = (HeapNode<T>)root;
        HeapNode<T> left = (HeapNode<T>)node.left;
        HeapNode<T> right = (HeapNode<T>)node.right;
        HeapNode<T> next;
        if((left == null) && (right == null))
            next = null;
        else if (left == null)
            next = right;
        else if (right == null)
            next = left;
        else if (((Comparable)left.getElement()).compareTo(right.getElement()) < 0)
            next = left;
        else
            next = right;
        temp = node.getElement();
        while ((next != null) && (((Comparable)next.getElement()).compareTo(temp) < 0)){
            node.element = next.element;
            node = next;
            left = (HeapNode<T>)node.left;
            right = (HeapNode<T>)node.right;
        }
    }
}
