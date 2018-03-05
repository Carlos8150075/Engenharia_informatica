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
public class VinhoEstrangeiro extends Bebida{
    private String morada;
    private int numero;
    
    public VinhoEstrangeiro(String name, float teor, String fornecedor, int stock, float preco) {
        super(name, teor, fornecedor, stock, preco);
    }

    @Override
    public double calculaLucro() {
        float acrescimo = (float) 0.15;
        float taxa = this.getPreco() * acrescimo;
        float preco_unit = this.getPreco() + taxa;
        return preco_unit * getStock();
    }

    @Override
    public void imprimeStock() {
        System.out.println("Vinho estrangeiro " + getName() + "Quantidade em stock " + getStock());
    }

    @Override
    public void imprimeDetalhes() {
        System.out.println("Bebida{" + "name=" + getName() + ", teor=" + getTeor() + ", fornecedor=" + getFornecedor() + ", stock=" + getStock() + ", preco=" + getPreco() + ", morada=" + getMorada() + ", numero=" + getNumero());
    }

    @Override
    public double compra(int n, double saldo) {
        if((saldo - n) < 0 && getStock() < 15){
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
        if((stock - n) < 0 && getStock() < 15){
            return -1;
        }else{
            stock =- n;
            return 1;
        }
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
