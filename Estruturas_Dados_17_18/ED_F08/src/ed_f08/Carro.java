/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_f08;

/**
 *
 * @author Bernardo
 */
public class Carro {
    private int cilindrada;
    private String marca;
    private int nPortas;

    public Carro(int cilindrada, String marca, int nPortas) {
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.nPortas = nPortas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }
    
    
}
