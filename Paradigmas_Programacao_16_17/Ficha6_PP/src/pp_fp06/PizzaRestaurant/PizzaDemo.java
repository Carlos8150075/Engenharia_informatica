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
public class PizzaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaIngredients[] ingrediente = new PizzaIngredients[]{
            new PizzaIngredients(1, "Fiambre", "30 Gramas"),
            new PizzaIngredients(2, "Cogumelos", "20 Gramas"),
            new PizzaIngredients(3, "Pimento", "12 Gramas"),
            new PizzaIngredients(4, "Ananas", "9 Gramas")
        };
        Pizza[] pizzas = new Pizza[]{
            new Pizza(1, "Fiambre", "Pizza de fiambre", 19.50, TamanhoPizza.PizzaSize.BIG),
            new Pizza(2, "Especial", "Pizza Especial", 20.00, TamanhoPizza.PizzaSize.KING)
        };

        pizzas[0].addIngrediente(ingrediente[0]);
        pizzas[0].addIngrediente(ingrediente[2]);
        pizzas[0].addIngrediente(ingrediente[3]);
        pizzas[1].addIngrediente(ingrediente[1]);
        pizzas[1].addIngrediente(ingrediente[3]);
        pizzas[1].addIngrediente(ingrediente[0]);
        pizzas[0].removeIngrediente(1);
        pizzas[1].removeIngrediente(4);

        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }

    }

}
