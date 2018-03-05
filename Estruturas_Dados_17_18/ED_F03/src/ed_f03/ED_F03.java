/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_f03;


/**
 *
 * @author Bernardo
 */
public class ED_F03 {

    /**
     * @param args the command line arguments
     * @throws ed_f03.EmptyCollectionException
     */
    public static void main(String[] args) throws EmptyCollectionException {
        ArrayStack<Pessoa> as = new ArrayStack(3);
        Pessoa p1 = new Pessoa("Jose", 3);
        Pessoa p2 = new Pessoa("Maria", 1);
        Pessoa p3 = new Pessoa("Joao", 32);
        as.push(p1);
        as.push(p2);
        as.push(p3);
        System.out.println(as.size());
        //System.out.println(as.peek());
        //System.out.println(as.size());
        //as.pop();
        //as.pop();
        System.out.println(as.peek());
        
        
        System.out.println(as.size());
        System.out.println(as.toString());
    }
    
    
}
