/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_f01;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class Ordenar<T extends String> implements Comparable<Ordenar> {

    private T name;

    public Ordenar(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ordenar{" + "name=" + name + '}';
    }
    
    @Override
    public int compareTo(Ordenar t) {
        if (t.name.length() < name.length()) {
            return 1;
        }
        return -1;
    }

}
