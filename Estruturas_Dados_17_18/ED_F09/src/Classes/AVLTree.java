/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class AVLTree<T extends Comparable<T>> extends LinkedBinarySearchTree<T> {

    @Override
    public T removeMax() {
        return super.removeMax(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeMin() throws EmptyCollectionException {
        return super.removeMin(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeElement(T targetElement) throws ElementNotFoundException {
        return super.removeElement(targetElement); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addElement(T element) {
        super.addElement(element);
    }

    protected int height(AVLTreeNode<T> node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height((AVLTreeNode<T>) node.left);
        int rightHeight = height((AVLTreeNode<T>) node.right);
        if (leftHeight > rightHeight) {
            return 1 + leftHeight;
        } else {
            return 1 + rightHeight;
        }
    }

    protected AVLTreeNode<T> leftRotation(AVLTreeNode<T> node){
        AVLTreeNode<T> temp = (AVLTreeNode<T>) node.right;        
        node.right = temp.left;
        temp.left = node;
        return temp;
    }

    protected AVLTreeNode<T> rightRotation(AVLTreeNode<T> node){
        AVLTreeNode<T> temp = (AVLTreeNode<T>) node.left;
        node.left = temp.right;
        temp.right = node;
        return temp;
    }
    
    protected AVLTreeNode<T> rightLeftRotation(AVLTreeNode<T> node){
        node.right = rightRotation((AVLTreeNode<T>) node.right);
        return leftRotation(node);
    }
    
    protected AVLTreeNode<T> leftRightRotation(AVLTreeNode<T> node){
        node.left = leftRotation((AVLTreeNode<T>) node.left);
        return rightRotation(node);
    }
}
