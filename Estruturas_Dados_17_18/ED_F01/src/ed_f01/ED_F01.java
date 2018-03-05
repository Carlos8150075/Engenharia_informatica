package ed_f01;

import com.sun.jmx.remote.util.OrderClassLoaders;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Bernardo
 */
public class ED_F01 {

    
    public static void printCollection(Collection<?> c){
        for(Object e : c){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        //TwoTypePair<Integer, Integer> t = new TwoTypePair<>(12, 3);
        //TRUE:  System.out.println(t.equals(new TwoTypePair<>(12, 3)));
        //FALSE (segundo if): System.out.println(t.equals(12);
        
        
        //printCollection(stones);
        
        List<Ordenar> o = new ArrayList<>();
        o.add(new Ordenar("mmm"));
        o.add(new Ordenar("ssssssssssss"));
        o.add(new Ordenar("s"));
        Collections.sort(o);
        printCollection(o);
    }

}
