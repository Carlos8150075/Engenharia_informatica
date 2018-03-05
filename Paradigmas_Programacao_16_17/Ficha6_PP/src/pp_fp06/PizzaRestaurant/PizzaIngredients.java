/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

/**
 *
 * @author Bernardo
 */
public class PizzaIngredients {
    private int id;
    private String name;
    private String unity;

    public PizzaIngredients(int id, String name, String unity) {
        this.id = id;
        this.name = name;
        this.unity = unity;
    }

    @Override
    public String toString() {
        return "PizzaIngredients{" + "id=" + id + ", name=" + name + ", unity=" + unity + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }
    
}
