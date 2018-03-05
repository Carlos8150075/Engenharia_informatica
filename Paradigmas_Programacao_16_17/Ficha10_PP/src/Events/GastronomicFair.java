/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

import java.util.Calendar;

/**
 *
 * @author Bernardo
 */
public class GastronomicFair extends Event{
    private int NumberOfRestaurants;
    private static final int PRICE_P_PERSON = 20;

    public GastronomicFair(int NumberOfRestaurants, String nome, String desc, String conc, String district, Calendar dtIni, Calendar dtFim) {
        super(nome, desc, conc, district, dtIni, dtFim);
        this.NumberOfRestaurants = NumberOfRestaurants;
    }
    
    @Override
    public double calculateBudget() {
        double budjet = PRICE_P_PERSON * DiferenceBetweenDays();
        return budjet;
    }

    public int getNumberOfRestaurants() {
        return NumberOfRestaurants;
    }

    public void setNumberOfRestaurants(int NumberOfRestaurants) {
        this.NumberOfRestaurants = NumberOfRestaurants;
    }
    
    
}
