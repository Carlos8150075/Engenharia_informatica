/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Exceptions.ElementNotFoundException;
import Interfaces.BinaryTreeADT;
import java.util.Iterator;
/**
 *
 * @author Bernardo
 * @param <T>
 */
public class ArrayBinaryTree<T> implements BinaryTreeADT<T>{
    protected int count;
    protected T[] tree;
    private final int CAPACITY = 50;
    
    public ArrayBinaryTree(){
        count = 0;
        tree = (T[]) new Object[CAPACITY];
    }
    
    public ArrayBinaryTree(T element){
        count = 1;
        tree = (T[]) new Object[CAPACITY];
        tree[0] = element;
    }

    @Override
    public T getRoot() {
        return tree[0];
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
    public boolean contains(T targetElement) {
        int i = 0;
        while(!(tree[i].equals(targetElement)) && i < count){
            i++;
        }
        return tree[i].equals(targetElement);
    }

    @Override
    public T find(T targetElement) throws ElementNotFoundException {
        T temp = null;
        boolean found = false;
        
        for(int i = 0; i < count; i++){
            if(targetElement.equals(tree[i])){
                found = true;
                temp = tree[i];
            }
        }
        if(!found)
            throw new ElementNotFoundException("Binary tree");
        return temp;
    }

    @Override
    public Iterator<T> iteratorInOrder() {
        ArrayUnorderedList<T> tempList = new ArrayUnorderedList<>();
        inorder(0, tempList);
        return tempList.iterator();
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
        ArrayUnorderedList<T> tempList = new ArrayUnorderedList<>();
        preorder(0, tempList);
        return tempList.iterator();
    }

    @Override
    public Iterator<T> iteratorPostOrder() {
        ArrayUnorderedList<T> tempList = new ArrayUnorderedList<>();
        postorder(0, tempList);
        return tempList.iterator(); 
    }

    @Override
    public Iterator<T> iteratorLevelOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected void inorder(int node, ArrayUnorderedList<T> tempList){
        if(node < tree.length)
            if(tree[node] != null){
                inorder(node*2+1, tempList);
                tempList.addToRear(tree[node]);
                inorder((node+1)*2, tempList);
            }
    }
    
    protected void preorder(int node, ArrayUnorderedList<T> tempList){
        if(node < tree.length)
            if(tree[node] != null){
                tempList.addToRear(tree[node]);
                preorder(node*2+1, tempList);
                preorder((node+1)*2, tempList);
            }
    }
    
    protected void postorder(int node, ArrayUnorderedList<T> tempList){
        if(node < tree.length)
            if(tree[node] != null){
                postorder(node*2+1, tempList);
                postorder((node+1)*2, tempList);
                tempList.addToRear(tree[node]);
            }
    }
    
    protected void levelorder(int node, ArrayUnorderedList<T> tempList){
        //Usar queue e unordered list
        if(node < tree.length)
            if(tree[node] != null){
                tempList.addToRear(tree[node]);
            }
    }

}
