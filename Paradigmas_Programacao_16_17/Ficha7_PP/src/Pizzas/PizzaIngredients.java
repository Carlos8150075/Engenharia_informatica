/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas;

/**
 *
 * @author Bernardo
 */
public class PizzaIngredients {
    private Ingredient ing;
    private float quant;

    public PizzaIngredients(Ingredient ing, float quant) {
        this.ing = ing;
        this.quant = quant;
    }

    public Ingredient getIng() {
        return ing;
    }

    public void setIng(Ingredient ing) {
        this.ing = ing;
    }

    public float getQuant() {
        return quant;
    }

    public void setQuant(float quant) {
        this.quant = quant;
    }
}
