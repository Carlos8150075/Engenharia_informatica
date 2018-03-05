/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinogest;

/**
 *
 * @author Bernardo
 */
public class GestorBebidas {
    private Bebida[] bebidas;
    private float saldo;

    public GestorBebidas(Bebida[] bebidas, float saldo) {
        this.bebidas = bebidas;
        this.saldo = saldo;
    }
    
    public Bebida[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida[] bebidas) {
        this.bebidas = bebidas;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void imprimeStockCompleto(){
        for(Bebida b : bebidas){
            System.out.println("Nome: " + b.getName() + "Quantidade em stock: " + b.getStock());
        }
    }
    public void imprimeDetalhesCompleto(){
        
    }
}
