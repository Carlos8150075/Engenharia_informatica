/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzas;
import Pizzas.Enums.BaseType;
import Pizzas.Enums.IngredientMeasureUnits;
/**
 *
 * @author Bernardo
 */
public class Base extends Ingredient{
    private BaseType type;

    public Base(BaseType type, int id, String name, IngredientMeasureUnits unit, float calories) {
        super(id, name, unit, calories);
        this.type = type;
    }

    public BaseType getType() {
        return type;
    }

    public void setType(BaseType type) {
        this.type = type;
    }
    
}
