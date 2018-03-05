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
public class CesarsCypher {
//    private int[] key;

    QueueADT<Integer> cq;

    public CesarsCypher(int[] key) {
        cq = new CircularArrayQueue<>();
        for (int i = 0; i < key.length; i++) {
            cq.enqueue(key[i]);
        }
    }

    public QueueADT<Integer> getCq() {
        return cq;
    }

    public void setCq(QueueADT<Integer> cq) {
        this.cq = cq;
    }

    public String encode(String message) {
        StringBuffer newString = new StringBuffer("");

        for (int i = 0; i < cq.size(); i++) {

            Integer element = cq.dequeue();
            char res = (char) (element + message.charAt(i));
            if (res > 'z') {
                int dif = res - 'z' - 1;
                newString.append((char)('a' + dif));
            } else {
                newString.append(res);
            }
            cq.enqueue(element);

        }
        return newString.toString();
    }

    public void decode() {

    }
}
