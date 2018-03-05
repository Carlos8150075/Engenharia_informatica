/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pizzas;

import Pizzas.Enums.IngredientMeasureUnits;
import Pizzas.Enums.IngredientOrigin;

/**
 *
 * @author Bernardo
 */
public class Topping extends Ingredient{
    private IngredientOrigin origin;

    public Topping(int id, String name, IngredientMeasureUnits unit, float calories) {
        super(id, name, unit, calories);
    }

    public IngredientOrigin getOrigin() {
        return origin;
    }

    public void setOrigin(IngredientOrigin origin) {
        this.origin = origin;
    }
    
    
    
}
