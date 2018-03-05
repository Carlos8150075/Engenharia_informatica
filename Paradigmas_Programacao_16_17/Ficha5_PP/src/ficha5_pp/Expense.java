/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5_pp;

import java.util.Date;
import pp_fp04.exchange.CurrencyRates;
/**
 *
 * @author Bernardo
 */
public class Expense {
    protected int number;
    protected String type;
    protected float value;
    protected String currency;
    protected Date data;
    Expense(int tempNumber, String tempType, float tempValue, Date tempDate, String tempCurrency){
        number = tempNumber;
        type = tempType;
        if (tempCurrency == "dolars"){
            value = tempValue * CurrencyRates.dolares;
        }
        if(tempCurrency == "ienes"){
            value = tempValue * CurrencyRates.ienes;
        }
        value = tempValue;
        data = tempDate;
        currency = tempCurrency;
    }
    
}
