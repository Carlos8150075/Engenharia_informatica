/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.cd;

/**
 *
 * @author Bernardo
 */
public class Track {
    protected int n_faixa;
    protected String nome;
    protected int duracao;
    Author[] autores = new Author[5];
    
    public Track(int n_faixa, String nome, int duracao, String autor) {
        this.n_faixa = n_faixa;
        this.nome = nome;
        this.duracao = duracao;
    }
}
