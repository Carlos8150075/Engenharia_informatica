/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author Bernardo
 * @param <T>
 */
public class Ex_04<T extends Comparable>{
    QueueADT<T> q1;
    QueueADT<T> q2;
    
    public Ex_04(QueueADT<T> q1,QueueADT<T> q2){
        this.q1 = q1;
        this.q2 = q2;
    }
    
    public QueueADT sortQeueus(){
        QueueADT<Comparable> q3 = new LinkedQueue<>();
        while(q1.size() > 0 && q2.size() > 0){
            if(q1.first().compareTo(q2.first()) < 0){
                q3.enqueue(q1.dequeue());
            }else{
                q3.enqueue(q2.dequeue());
            }
            
        }
        while(q1.size() > 0){
            q3.enqueue(q1.dequeue());
        }
        while(q2.size() > 0){
            q3.enqueue(q2.dequeue());
        }
        return q3;
    }
}
