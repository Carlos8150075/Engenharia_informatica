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
public class Pizza {
    private final int MAX_INGREDIENTE = 5;
    private int id;
    private String name;
    private String desc;
    private double preço;
    private TamanhoPizza.PizzaSize size;
    private PizzaIngredients[] ingredients;
    private int numberOfIngredients;

    public Pizza(int id, String name, String desc, double preço, TamanhoPizza.PizzaSize size) {
        ingredients = new PizzaIngredients[MAX_INGREDIENTE];
        numberOfIngredients = 0;
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.preço = preço;
        this.size = size;
    }
    public void addIngrediente(PizzaIngredients ing){
        if(numberOfIngredients < MAX_INGREDIENTE){
            this.ingredients[numberOfIngredients] = ing;
            this.numberOfIngredients++;
        }
    }
    public boolean removeIngrediente(int id){
        for(int i = 0; i < numberOfIngredients; i++){
            if(ingredients[i].getId()==id){
                while(i<numberOfIngredients){
                    ingredients[i] = ingredients[i + 1];
                    i++;
                }
                numberOfIngredients--;
                return true;
            }
            
        }
        return false;
    }
    @Override
    public String toString() {
        return "Pizza{" + "MAX_INGREDIENTE=" + MAX_INGREDIENTE + ", id=" + id + ", name=" + name + ", desc=" + desc + ", pre\u00e7o=" + preço + ", size=" + size + ", ingredients=" + ingtoString() + ", numberOfIngredients=" + numberOfIngredients + '}';
    }
    private String ingtoString(){
        String s = new String();
        for(int i = 0; i < numberOfIngredients; i++){
            s = s + ingredients[i].toString();
        }
        return s;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public TamanhoPizza.PizzaSize getSize() {
        return size;
    }

    public void setSize(TamanhoPizza.PizzaSize size) {
        this.size = size;
    }

    public PizzaIngredients[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(PizzaIngredients[] ingredients) {
        this.ingredients = ingredients;
    }

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public void setNumberOfIngredients(int numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    } 
}
