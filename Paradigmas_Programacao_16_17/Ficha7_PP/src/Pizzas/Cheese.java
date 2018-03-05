/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas;
import Pizzas.Enums.CheeseType;
import Pizzas.Enums.IngredientMeasureUnits;
/**
 *
 * @author Bernardo
 */
public class Cheese extends Topping{
    private CheeseType type;

    public Cheese(CheeseType type, int id, String name, IngredientMeasureUnits unit, float calories) {
        super(id, name, unit, calories);
        this.type = type;
    }

    public CheeseType getType() {
        return type;
    }

    public void setType(CheeseType type) {
        this.type = type;
    }
    
}
