/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Bernardo
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueADT<Pessoa> lq = new LinkedQueue<>();
        Pessoa p1 = new Pessoa("Tadeu", 3);
        Pessoa p2 = new Pessoa("Joe", 12);
        Pessoa p3 = new Pessoa("Guy", 23);
        lq.enqueue(p1);
        lq.enqueue(p2);
        lq.enqueue(p3);
        lq.dequeue();
    //    System.out.println("Removido: " + lq.dequeue());
        System.out.println(lq.toString());


//        int[] key = {1,2,3,4};
//        CesarsCypher cc = new CesarsCypher(key);
//        System.out.println(cc.encode("zzzz"));

//        QueueADT<Object> q1 = new LinkedQueue<>();
//        QueueADT<Object> q2 = new LinkedQueue<>();
//        q1.enqueue(3);
//        q1.enqueue(4);
//        q1.enqueue(5);
//        q2.enqueue(1);
//        //Ex_04 ex4 = new Ex_04(q1, q2);
        //System.out.println(ex4.sortQeueus());
    }
    
}
