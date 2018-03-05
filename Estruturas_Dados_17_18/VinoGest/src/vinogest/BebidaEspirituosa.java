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
public class BebidaEspirituosa extends Bebida{
    private float capacidade;
    private String unidade;

    public BebidaEspirituosa(float capacidade, String unidade, String name, float teor, String fornecedor, int stock, float preco) {
        super(name, teor, fornecedor, stock, preco);
        this.capacidade = capacidade;
        this.unidade = unidade;
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
        System.out.println("Bebida Espirituosa " + getName() + "Quantidade em Stock " + getStock());
    }

    @Override
    public void imprimeDetalhes() {
        System.out.println("Bebida{" + "name=" + getName() + ", teor=" + getTeor() + ", fornecedor=" + getFornecedor() + ", stock=" + getStock() + ", preco=" + getPreco() + ", capacidade=" + getCapacidade() + ", unidade=" + getUnidade());
    }

   

    @Override
    public double compra(int n, double saldo) {
        if((saldo - n) < 0 && getStock() < 12){
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
        if((stock - n) < 0 && getStock() < 12){
            return -1;
        }else{
            stock =- n;
            return 1;
        }
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
}
