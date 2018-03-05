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
public class MusicFestival extends Event{
    private int RecintSize;
    private int MaxCapacity;
    private static final int PRICE_P_PERSON = 30;

    public MusicFestival(int RecintSize, int MaxCapacity, String nome, String desc, String conc, String district, Calendar dtIni, Calendar dtFim) {
        super(nome, desc, conc, district, dtIni, dtFim);
        this.RecintSize = RecintSize;
        this.MaxCapacity = MaxCapacity;
    }

    

    public int getRecintSize() {
        return RecintSize;
    }

    public void setRecintSize(int RecintSize) {
        this.RecintSize = RecintSize;
    }

    public int getMaxCapacity() {
        return MaxCapacity;
    }

    public void setMaxCapacity(int MaxCapacity) {
        this.MaxCapacity = MaxCapacity;
    }

    @Override
    public double calculateBudget() {
        double budjet = PRICE_P_PERSON * DiferenceBetweenDays();
        return budjet;
    }
    
    
}
