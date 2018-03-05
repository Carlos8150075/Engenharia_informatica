/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfix;

/**
 *
 * @author Bernardo
 */
public class Demo_postfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmptyCollectionException {
        // TODO code application logic here
        postfix_arrayStack<String> pas = new postfix_arrayStack<>();
        pas.calcula("2");
        pas.calcula("1");
        pas.calcula("-");
        System.out.println(pas.as.peek());
    }
    
}
