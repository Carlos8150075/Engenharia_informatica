/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas;
import Pizzas.Enums.TamanhoPizza;
/**
 *
 * @author Bernardo
 */
public class Pizza {
    private final int MAX_INGREDIENTE = 5;
    private final int MAX_BASE = 1;
    private int id;
    private String name;
    private String desc;
    private double preço;
    private TamanhoPizza.PizzaSize size;
    private Ingredient[] ingredients;
    private int numberOfIngredients;
    private int numberOfBases;
    private int numberOfToppings;

    public Pizza(int id, String name, String desc, double preço, TamanhoPizza.PizzaSize size) {
        ingredients = new Ingredient[MAX_INGREDIENTE];
        numberOfIngredients = 0;
        numberOfBases = 0;
        numberOfToppings = 0;
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.preço = preço;
        this.size = size;
    }
    /**
     * 
     * @param b
     * @return 
     */
    public int addBase(Base b){
            if (numberOfBases < MAX_BASE) { 
                this.ingredients[numberOfIngredients] = b;
                numberOfBases = 1;
            }
        return numberOfBases;
    }
    
    /**
     * 
     * @param t 
     */
    public void addTopping(Topping t) {
        
        if (numberOfBases == 1 && numberOfToppings < 5) {
            if (numberOfIngredients < MAX_INGREDIENTE) {
                this.ingredients[numberOfIngredients] = t;
                this.numberOfIngredients++;
                this.numberOfToppings++;
            }
        } else {
            System.out.println("Tem que adicionar base primeiro Ou já tem mais que"
                    + "5 Toppings");
        }
        
    }
    /**
     * Este metodo tem como objetivo adicionar um ingrediente numa determinada
     * pizza, verificando se já existe uma base nessa mesma pizza. Se ainda não
     * exitir base é obrigado a adicionar  base, se já existir o ingrediente
     * passado como parametro  é adicionado ao vetor de ingredientes.
     * 
     * @param ing Variavel do tipo Ingrediente
     */
    public void addIngrediente(Ingredient ing) {
        if (ing instanceof Base && numberOfBases == 1) {
            return;
        } else if (ing instanceof Base && numberOfBases == 0) {
            addBase((Base) ing);
        } else {
            if (numberOfIngredients < MAX_INGREDIENTE) {
                this.ingredients[numberOfIngredients] = ing;
                this.numberOfIngredients++;
            }
        }
    }
    /**
     * 
     * @param id
     * @return 
     */
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

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public void setNumberOfIngredients(int numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    } 

    public int getNumberOfBases() {
        return numberOfBases;
    }

    public void setNumberOfBases(int numberOfBases) {
        this.numberOfBases = numberOfBases;
    }
    
}
