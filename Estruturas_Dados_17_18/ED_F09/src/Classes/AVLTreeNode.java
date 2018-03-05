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
public class AVLTreeNode<T> extends BinaryTreeNode<T>{
    private int factor;
    public AVLTreeNode(T obj) {
        super(obj);
        factor = 0;
    }

   
}
