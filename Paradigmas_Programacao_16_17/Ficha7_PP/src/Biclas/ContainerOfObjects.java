/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biclas;

/**
 *
 * @author Bernardo
 */
public class ContainerOfObjects {

    private final int DEFAULT_SIZE = 100;
    private Object objects[];
    private int pos;

    /**
     * 
     * @param objects 
     */
    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
        this.pos = objects.length;
    }

    /**
     * 
     */
    public ContainerOfObjects() {
        this.objects = new Object[DEFAULT_SIZE];
        this.pos = 0;
    }

    /**
     * 
     * @param maxSize 
     */
    public ContainerOfObjects(int maxSize) {
        this.objects = new Object[maxSize];
        this.pos = 0;
    }
    /**
     * 
     * @param newObject
     * @return 
     */
    protected boolean addObject(Object newObject) {
        if (pos < DEFAULT_SIZE) {
            objects[pos] = newObject;
            pos++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param position
     * @return 
     */
    protected Object removeObject(int position) {
        if (position >= 0 && position < objects.length && position < pos) {
            Object x = objects[position];
            for (int i = position; i < this.pos - 1; i++) {
                objects[i] = objects[i + 1];
            }
            this.pos--;
            return x;
        }
        return null;
    }

    /**
     * 
     * @param position
     * @param newObject
     * @return 
     */
    protected boolean setObject(int position, Object newObject) {
        if (position >= 0 && position < objects.length && position < pos) {
            objects[position] = newObject;
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param obj
     * @return 
     */
    protected int findObject(Object obj){
        for(int i = 0; i < this.pos; i++){
            if(objects[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }
}
