/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas;
import Pizzas.Enums.IngredientMeasureUnits;
import Pizzas.Enums.SeaFoodType;
/**
 *
 * @author Bernardo
 */
public class SeaFood extends Topping{
    private SeaFoodType type;

    public SeaFood(SeaFoodType type, int id, String name, IngredientMeasureUnits unit, float calories) {
        super(id, name, unit, calories);
        this.type = type;
    }

    public SeaFoodType getType() {
        return type;
    }

    public void setType(SeaFoodType type) {
        this.type = type;
    }

    
    
    
    
}
