/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedStack;

/**
 *
 * @author Bernardo
 */
public class Demo {

    /**
     * @param args the command line arguments
     * @throws linkedStack.EmptyCollectionException
     */
    public static void main(String[] args) throws EmptyCollectionException {
        LinkedStack<Pessoa> ls = new LinkedStack<>();
        Pessoa p1 = new Pessoa("Campeao", 2);
        Pessoa p2 = new Pessoa("Filho", 21);
        Pessoa p3 = new Pessoa("Matilde", 23);
        ls.push(p1);
        ls.push(p2);
        ls.push(p3);
        ls.pop();
        System.out.println(ls.peek());
        System.out.println("----------------");
        System.out.println(ls.toString());
    }
    
}
