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
public class ArtExhibition extends Event{
    private static final int MAX_ARTISTS = 10;
    private String[] ArtistsNames = new String[MAX_ARTISTS];
    private static final int PRICE_P_PERSON = 20;
            
    public ArtExhibition(String nome, String desc, String conc, String district, Calendar dtIni, Calendar dtFim) {
        super(nome, desc, conc, district, dtIni, dtFim);
    }
    
    
    
    
    
    @Override
    public double calculateBudget() {
        int budjet = PRICE_P_PERSON;
        int counter = SundayCounter();
        
        
        return budjet;
    }

    public String[] getArtistsNames() {
        return ArtistsNames;
    }

    public void setArtistsNames(String[] ArtistsNames) {
        this.ArtistsNames = ArtistsNames;
    }
    
}
