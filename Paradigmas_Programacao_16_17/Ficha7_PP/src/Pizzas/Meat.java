/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas;
import Pizzas.Enums.IngredientMeasureUnits;
import Pizzas.Enums.MeatType;
/**
 *
 * @author Bernardo
 */
public class Meat extends Topping{
    private MeatType type;

    public Meat(MeatType type, int id, String name, IngredientMeasureUnits unit, float calories) {
        super(id, name, unit, calories);
        this.type = type;
    }

    public MeatType getType() {
        return type;
    }
    
    public void setType(MeatType type) {
        this.type = type;
    }
    
}
