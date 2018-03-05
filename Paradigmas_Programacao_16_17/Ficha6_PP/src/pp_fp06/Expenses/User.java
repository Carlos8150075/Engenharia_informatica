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
public class User {
    private static final int ID_SIZE = 3;
    private char[] id;
    private String name;
    private String email;
    private Date birthDate;
    private Expense[] expenses;

    public User(char[] id, String name, String email, Date birthDate, Expense[] expenses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.expenses = expenses;
    }
    
    
    public char[] getId() {
        return id;
    }

    public void setId(char[] id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Expense[] getExpenses() {
        return expenses;
    }

    public void setExpenses(Expense[] expenses) {
        this.expenses = expenses;
    }

    
}
