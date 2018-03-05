/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfix;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class postfix_arrayStack<T extends String>{
    ArrayStack<Double> as = new ArrayStack<>();

    
    
    
    public void calcula(T x) throws EmptyCollectionException{
        try{
            double s = isNumber(x);
            as.push(s);
        }catch(NumberFormatException n){
            if(x.equals("+"))
                as.push(as.pop() + as.pop());
            if(x.equals("-")){
                double n1,n2;
                n1 = as.pop();
                n2 = as.pop();
                as.push(n2 - n1);
            }
            if(x.equals("*"))
                as.push(as.pop() * as.pop());
            if(x.equals("/")){
                double n1,n2;
                n1 = as.pop();
                n2 = as.pop();
                as.push(n2 / n1);
            }
        }
    }
    
    public int isNumber(String s)throws NumberFormatException{
        return Integer.parseInt(s);
    }
    
//    public boolean isNumber(String s){
//        try{
//            Integer.parseInt(s);
//            return true;
//        }catch(NumberFormatException n){
//            return false;
//        }
//    }
}
