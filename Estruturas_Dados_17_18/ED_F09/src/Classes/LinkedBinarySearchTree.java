/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.*;
import Exceptions.*;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class LinkedBinarySearchTree<T extends Comparable<T>> extends BinaryLinkedTree<T> implements BinarySearchTreeADT<T> {

    public LinkedBinarySearchTree() {
        super();
    }

    public LinkedBinarySearchTree(T element) {
        super(element);
    }

    @Override
    public void addElement(T element) {
        BinaryTreeNode<T> temp = new BinaryTreeNode<>(element);
        //Comparable<T> comparableElement = (Comparable<T>)element;
        if (isEmpty()) {
            root = temp; //PERMITE PERCORRER A ARVORE
        } else {
            BinaryTreeNode<T> current = root;
            boolean added = false;
            while (!added) {
                if (element.compareTo(current.getElement()) < 0) { //INTRODUZIR A ESQUERDA
                    if (current.left == null) {
                        current.left = temp;
                        added = true;
                    } else {
                        current = current.left; //FOI PARA O NIVEL DE BAIXO
                    }
                } else {
                    if (current.right == null) {
                        current.right = temp;
                        added = true;
                    } else {
                        current = current.right; //DESCE PARA A DIREITA
                    }
                }
            }
        }
        count++;
    }

    @Override
    public T removeElement(T targetElement) throws ElementNotFoundException {
        T old_elem = null;
        if (!(isEmpty())) {
            if (((Comparable) targetElement).equals(root.getElement())) {
                old_elem = root.getElement();
                root = replacement(root);
                count--;
            } else {

                BinaryTreeNode<T> current, parent = root; //REFERENCIA PARA O ANTERIOR (PARENT)
                boolean found = false;
                if (((Comparable) targetElement).compareTo(root.getElement()) < 0) //LADO A COMEÇAR DEPOIS DE COMPARAR
                {
                    current = root.left;
                } else {
                    current = root.right;
                }
                while (current != null && !found) {
                    if (targetElement.equals(current.getElement())) {
                        found = true;
                        count--;
                        old_elem = current.getElement();
                        if (current == parent.left) {
                            parent.left = replacement(current);
                            
                        } else {
                            parent.right = replacement(current);
                            
                        }
                    } else {
                        parent = current;
                        if (((Comparable) targetElement).compareTo(root.getElement()) < 0) {
                            current = current.left;
                        } else {
                            current = current.right;
                        }
                    }
                }
                if (!found) {
                    throw new ElementNotFoundException("Tree");
                }
            }
        }
        return old_elem;
    }

    @Override
    public void removeAllOccurrences(T targetElement) throws ElementNotFoundException {
        removeElement(targetElement);
        try {
            while (true) {
                removeElement(targetElement);
            }
        } catch (ElementNotFoundException e) {
        }
    }

    @Override
    public T removeMin() throws EmptyCollectionException{
        T min = null;
        if (root.left == null) {
            root = root.right;
        } else {
            BinaryTreeNode<T> parent = root;
            BinaryTreeNode<T> current = parent.left;
            while (current.left != null) {
                parent = current;
                current = current.left;
            }
            min = parent.left.getElement();
            if (current.right != null) {
                parent.left = current.right;
            } else {
                parent.left = null;
            }
            return min;
        }
        return root.getElement();
    }

    @Override
    public T removeMax() {
        T max = null;
        if (root.right == null) {
            root = root.left;
        } else {
            BinaryTreeNode<T> parent = root;
            BinaryTreeNode<T> current = parent.right;
            while (current.right != null) {
                parent = current;
                current = current.right;
            }
            max = parent.right.getElement();
            if (current.left != null) {
                parent.right = current.left;
            } else {
                parent.right = null;
            }
            return max;
        }
        return root.getElement();
    }

    @Override
    public T findMin() {
        BinaryTreeNode<T> parent = root;
        BinaryTreeNode<T> current = parent.left;
        while (current != null) {
            parent = current;
            current = current.left;
        }
        return parent.getElement();
    }

    @Override
    public T findMax() {
        BinaryTreeNode<T> parent = root;
        BinaryTreeNode<T> current = parent.right;
        while (current != null) {
            parent = current;
            current = current.right;
        }
        return parent.getElement();
    }

    protected BinaryTreeNode<T> replacement(BinaryTreeNode<T> node) {
        BinaryTreeNode<T> result = null;
        if ((node.left == null) && (node.right == null)) {
            result = null;
        } else if ((node.left != null) && (node.right == null)) {
            result = node.left;
        } else if ((node.left == null) && (node.right != null)) {
            result = node.right;
        } else {
            BinaryTreeNode<T> current = node.right; //ENCONTRAR VALOR MINIMO DA ARVORE DA DIREITA
            BinaryTreeNode<T> parent = node;
            while (current.left != null) {
                parent = current;
                current = current.left;     //AVANÇA UM NIVEL PARA BAIXO À ESQUERDA
            }                                       //ATÉ AQUI
            if (node.right == current) {
                current.left = node.left;
            } else {
                parent.left = current.right;
                current.right = node.right;
                current.left = node.left;
            }
            result = current;
        }
        return result;
    }

    

}
