/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;
import Enumerations.Language;
import Exceptions.CoordinatesNotFound;
import static geocoderapi.CalculateCoordinates.getCoordinate;
import geocoderapi.Coordinate;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Bernardo
 */
public abstract class Event implements Comparator{
    private String nome;
    private String desc;
    private String conc;
    private String district;
    private Calendar dtIni;
    private Calendar dtFim;
    

    public Event(String nome, String desc, String conc,String district, Calendar dtIni, Calendar dtFim) {
        this.nome = nome;
        this.desc = desc;
        this.conc = conc;
        this.dtIni = dtIni;
        this.dtFim = dtFim;
        this.district = district;
    }
    
    public Coordinate getCoordinates(){
        try {
            return getCoordinate(conc + "," + district, Language.PT);
        }
        catch(CoordinatesNotFound | IOException CoordinatesNotFound){
            return null;
        }
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getConc() {
        return conc;
    }

    public void setConc(String conc) {
        this.conc = conc;
    }

    public Calendar getDtIni() {
        return dtIni;
    }

    public void setDtIni(Calendar dtIni) {
        this.dtIni = dtIni;
    }

    public Calendar getDtFim() {
        return dtFim;
    }

    public void setDtFim(Calendar dtFim) {
        this.dtFim = dtFim;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
    protected int SundayCounter(){
        Calendar ci = new GregorianCalendar();
        Calendar cf = new GregorianCalendar();
        long di = ci.getTimeInMillis();
        long df = cf.getTimeInMillis();
        int counter = 0;
        while(ci.compareTo(cf)<0){
            Calendar c = new GregorianCalendar();
            c.setTimeInMillis(di);
            if(c.get(Calendar.DAY_OF_MONTH) == Calendar.SUNDAY){
                counter++;
            }
            c.add(Calendar.DAY_OF_MONTH, 1);
        }
        return counter;
    }
    
    protected int DiferenceBetweenDays(){
        Calendar ci = new GregorianCalendar();
        Calendar cf = new GregorianCalendar();
        long di = ci.getTimeInMillis();
        long df = cf.getTimeInMillis();
        return (int)((df-di)/(86400000));
    }
    
    public abstract double calculateBudget();

    @Override
    public int compareTo(Comparator obj) {
        if(obj instanceof Event){
            return (((Event)obj).DiferenceBetweenDays()) - this.DiferenceBetweenDays();
        }
        return 0;
    }
    
    
}
