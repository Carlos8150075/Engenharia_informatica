/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class BinaryTreeNode<T> {
    protected T element;
    protected BinaryTreeNode<T> right, left;
    
    BinaryTreeNode(T obj){
        element = obj;
        left = null;
        right = null;
    }
    
    public int numChildren(){
        int children = 0;
        if(left!=null)
            children = 1 + left.numChildren();
        if(right!=null)
            children = children + 1 + right.numChildren();
        return children;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }
    
}
