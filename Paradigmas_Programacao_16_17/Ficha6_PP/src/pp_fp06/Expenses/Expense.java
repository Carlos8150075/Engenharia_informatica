/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.Expenses;

import java.util.Date;

/**
 *
 * @author Bernardo
 */
public class Expense {
    private int number;
    private String type;
    private float value;
    private Date data;

    public Expense(int number, String type, float value, Date data) {
        this.number = number;
        this.type = type;
        this.value = value;
        this.data = data;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
