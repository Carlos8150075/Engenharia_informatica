/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4_pp;

import pp_fp04.exchange.CurrencyRates;

/**
 *
 * @author Bernardo
 */
public class Ficha4_PP {

    /**
     * @param args the command line arguments
     */
    static User user1;
    public static void main(String[] args) {
        user1.id[0]='A';
        user1.id[1]='B';
        user1.id[2]='C';
        user1.name = new char[]{'B','r','u','n','o'};
        user1.email = new char[]{'b','m','o','@','e','s','t','g','f','.','i','p','p','.','p','t'};
        System.out.println("-------User 1--------");
        System.out.println("ID: ");
        System.out.println(user1.id);
        System.out.println("Name: ");
        System.out.println(user1.name);
        System.out.println("Email: ");
        System.out.println(user1.email);
        double d_carro = 0;
        for(int i = 0;i < 31; i++){
            user1.despesas.carValues[i] = 10;
            d_carro = d_carro + user1.despesas.carValues[i];
        }
        System.out.println(d_carro * CurrencyRates.dolares);
    }
    
}
