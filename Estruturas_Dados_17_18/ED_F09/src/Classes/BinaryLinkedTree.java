/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Interfaces.BinaryTreeADT;
import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import java.util.Iterator;
/**
 *
 * @author Bernardo
 * @param <T>
 */
public class BinaryLinkedTree<T> implements BinaryTreeADT<T>{
    protected int count;
    protected BinaryTreeNode<T> root;

    
    public BinaryLinkedTree(){
        count = 0;
        root = null;
    }
    
    public BinaryLinkedTree(T element){
        count = 1;
        root = new BinaryTreeNode<>(element);
    }
    
    
    
    @Override
    public T getRoot() {
        return (T) root.getElement();
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
        return containsAgain(targetElement, root);
    }

    @Override
    public T find(T targetElement) throws ElementNotFoundException{
        BinaryTreeNode<T> current = findAgain(targetElement, root);
        if(current == null)
            throw new ElementNotFoundException("Binary Tree");
        
        return (current.getElement());
            
    }
    
    public boolean containsAgain(T obj, BinaryTreeNode temp){
        if(temp == null)
            return false;
        if(temp.getElement().equals(obj))
            return true;
        else 
            if(containsAgain(obj, temp.getRight()))
                return true;
            else
                return (containsAgain(obj, temp.getLeft()));
    }
    
    private BinaryTreeNode<T> findAgain(T targetElement, BinaryTreeNode<T> next){
        if(next == null)
            return null;
        if(next.getElement().equals(targetElement))
            return next;
        BinaryTreeNode<T> temp  = findAgain(targetElement, next.getLeft());
        if(temp == null)
            temp = findAgain(targetElement, next.getRight());
        return temp;
    }

    @Override
    public Iterator<T> iteratorInOrder() {
        ArrayUnorderedList<T> temp = new ArrayUnorderedList<>();
        inorder(root, temp);
        
        return temp.iterator();
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
        ArrayUnorderedList<T> temp = new ArrayUnorderedList<>();
        preorder(root, temp);
        return temp.iterator();
    }

    @Override
    public Iterator<T> iteratorPostOrder() {
        ArrayUnorderedList<T> temp = new ArrayUnorderedList<>();
        postorder(root, temp);
        return temp.iterator();
    }

    @Override
    public Iterator<T> iteratorLevelOrder() throws EmptyCollectionException{
        ArrayUnorderedList<T> node = new ArrayUnorderedList<>();
        ArrayUnorderedList<T> temp = new ArrayUnorderedList<>();
        BinaryTreeNode<T> current;
        
        node.addToRear(root.getElement());
        while(!(node.isEmpty())){
            current = (BinaryTreeNode<T>)node.removeFirst();
            if(current != null){
                temp.addToRear(current.getElement());
                node.addToRear(current.left.getElement());
                node.addToRear(current.right.getElement());
            }else{
                temp.addToRear(null);
            }
        }
        return temp.iterator();
    }
    
    
    protected void preorder(BinaryTreeNode<T> node, ArrayUnorderedList<T> tempList){
        if(node != null){
            tempList.addToRear(node.getElement());
            preorder(node.left, tempList);
            preorder(node.right, tempList);
        }
    }
    
    
    protected void inorder(BinaryTreeNode<T> node, ArrayUnorderedList<T> tempList){
        if(node != null){
            inorder(node.left, tempList);
            tempList.addToRear(node.getElement());
            inorder(node.right, tempList);
        }
    }
    
    
    protected void postorder(BinaryTreeNode<T> node, ArrayUnorderedList<T> tempList){
        if(node != null){
            postorder(node.left, tempList);
            postorder(node.right, tempList);
            tempList.addToRear(node.getElement());
        }
    }
    
    
    
}
