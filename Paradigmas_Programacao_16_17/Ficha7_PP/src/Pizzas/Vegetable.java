/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas;
import Pizzas.Enums.IngredientMeasureUnits;
import Pizzas.Enums.VegetableType;
/**
 *
 * @author Bernardo
 */
public class Vegetable extends Topping{
   private VegetableType type; 

    public Vegetable(VegetableType type, int id, String name, IngredientMeasureUnits unit, float calories) {
        super(id, name, unit, calories);
        this.type = type;
    }

    public VegetableType getType() {
        return type;
    }

    public void setType(VegetableType type) {
        this.type = type;
    }
   
}
