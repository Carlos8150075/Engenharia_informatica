/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas;
import Pizzas.Enums.IngredientMeasureUnits;
/**
 *
 * @author Bernardo
 */
public class Ingredient {
    private int id;
    private String name;
    private IngredientMeasureUnits unit;
    private float calories;

    public Ingredient(int id, String name, IngredientMeasureUnits unit, float calories) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.calories = calories;
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

    public IngredientMeasureUnits getUnit() {
        return unit;
    }

    public void setUnit(IngredientMeasureUnits unit) {
        this.unit = unit;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }
    
    
}
