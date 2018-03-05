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
public abstract class Bebida {
    private String name;
    private float teor;
    private String fornecedor;
    private int stock;
    private float preco;

    public Bebida(String name, float teor, String fornecedor, int stock, float preco) {
        this.name = name;
        this.teor = teor;
        this.fornecedor = fornecedor;
        this.stock = stock;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTeor() {
        return teor;
    }

    public void setTeor(float teor) {
        this.teor = teor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public abstract double calculaLucro();

    public abstract void imprimeStock();
    public abstract String imprimeDetalhes();
    public abstract double compra(int n, double saldo);
    public abstract double venda(int n);

    
    
}
