/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5_pp;

import java.util.Date;

/**
 *
 * @author Bernardo
 */
public class User {
    private static  final int ID_SIZE = 3;
    protected char[] id;
    protected String name;
    protected int id_est;
    protected Contribuicoes[] contr;
    protected String email;
    protected Date birthDate;
    protected Expense[] expenses;
    User(char[] tempID, String tempName, Date tempBirthDate,Expense[] tempExpenses,Contribuicoes[] tempContr){
        id = tempID;
        name = tempName;
        birthDate = tempBirthDate;
        expenses = tempExpenses;
        contr = tempContr;
    }
}
