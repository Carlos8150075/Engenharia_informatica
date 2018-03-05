/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectManagement;

import Exceptions.EmptyArray;
import Exceptions.NotAnInstanceOfObjects;
import java.util.Arrays;

/**
 *
 * @author Bernardo
 */
public class ContainerOfObjects{

    private final int DEFAULT_SIZE = 100;
    private Object objects[];
    private int pos;

    /**
     * Construtor que permite a instanciação da classe tendo por base um vetor
     * de elementos recebido
     * @param objects Lista de objetos em tamanho fixo
     */
    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
        this.pos = objects.length;
    }

    /**
     * Construtor que permite a instanciação da classe tendo por base um valor
     * por defeito
     */
    public ContainerOfObjects() {
        this.objects = new Object[DEFAULT_SIZE];
        this.pos = 0;
    }

    /**
     * Construtor que permite a instanciação da Classe definindo um valor máximo
     * de elementos
     * 
     * @param maxSize número máximo de elementos permitidos no vetor 
     */
    public ContainerOfObjects(int maxSize) {
        this.objects = new Object[maxSize];
        this.pos = 0;
    }
    /**
     * Método responsável por inserir um {@link Object objeto} na coleção de 
     * {@link ContainerOfObjects#objects objetos}
     * 
     * @param newObject {@link Object object} e inserir  no vetor 
     * @return valor booleano que sinaliza o sucesso/insucesso da operação
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
     * Método responsável por remover um {@link Object object} do vetor de 
     * {@link  ContainerOfObjects#objects objetos}
     * 
     * @param position indice correspondente ao elemento a eliminar
     * @return o {@link Object objeto} eliminado
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
     * Método responsável por substituir um {@link Object objeto} no vetor de
     * {@link ContainerOfObjects#objects objetos}
     * 
     * @param position indice correspondente ao elemento a modificar
     * @param newObject novo objeto a colocar no vetor  
     * @return booleano de acordo com o sucesso/insucesso da operação
     */
    protected boolean setObject(int position, Object newObject) {
        if (position >= 0 && position < objects.length && position < pos) {
            objects[position] = newObject;
            return true;
        }
        return false;
    }
    
    /**
     * Método
     * 
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
        
    protected void printAll(){
        for(Object object : objects){
            System.out.println(object);
        }
    }
    
    public int countObjects(){
        return pos;
    }
    
    public void sortObjects() throws EmptyArray, NotAnInstanceOfObjects{
        if(pos == 0){
           throw new EmptyArray();
        }
        if(objects[0] instanceof Comparator){
            Arrays.sort(objects);
        }else{
            throw new NotAnInstanceOfObjects();
        }
        
    } 
}
