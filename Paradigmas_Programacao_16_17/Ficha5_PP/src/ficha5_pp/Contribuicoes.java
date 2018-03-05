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
public class Contribuicoes {
    protected int valor;
    protected Date data;

    public Contribuicoes(int tempvalor, Date tempData) {
        if(tempvalor >= 1)
            valor = tempvalor;
    }
    
    
}
