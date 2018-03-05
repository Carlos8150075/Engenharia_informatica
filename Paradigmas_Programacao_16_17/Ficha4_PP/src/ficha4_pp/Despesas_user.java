/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4_pp;


/**
 *
 * @author Bernardo
 */
public class Despesas_user {
    static User user1;
    
    public static void main(String[] args) {
        double d_carro = 0;
        double d_food = 0;
        for(int i = 0;i < 31; i++){
            user1.despesas.carValues[i] = 10;
            d_carro = d_carro + user1.despesas.carValues[i];
        }
        System.out.println("Despesas carro: " + d_carro);
        
        
        for(int i = 0;i < 31;i++){
            user1.despesas.foodValues[i]=5;
            d_food = d_food +  user1.despesas.foodValues[i];
        }
        System.out.println("Despesas comida: " + d_food);
    }
}

