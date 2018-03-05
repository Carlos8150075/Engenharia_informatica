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
public class VinhoNacional extends Bebida{

    public VinhoNacional(String name, float teor, String fornecedor, int stock, float preco) {
        super(name, teor, fornecedor, stock, preco);
    }

    @Override
    public void imprimeStock() {
        System.out.println("Bebida " + getName() + "Quantidade em stock " + getStock());
    }

    @Override
    public void imprimeDetalhes() {
        System.out.println("Bebida{" + "name=" + getName() + ", teor=" + getTeor() + ", fornecedor=" + getFornecedor() + ", stock=" + getStock() + ", preco=" + getPreco());
    }

    

    @Override
    public double compra(int n, double saldo) {
        if((saldo - n) < 0 && getStock() < 10){
            return -1;
        }else{
            int stock = this.getStock();
            stock += n;
            return 1;
        }
    }

    @Override
    public double venda(int n) {
        int stock = this.getStock();
        if((stock - n) < 0 && getStock() < 10){
            return -1;
        }else{
            stock =- n;
            return 1;
        }
    }

    @Override
    public double calculaLucro() {
        float acrescimo = (float) 0.10;
        float taxa = this.getPreco() * acrescimo;
        return taxa;
    }
    
    
    
    
    
}
