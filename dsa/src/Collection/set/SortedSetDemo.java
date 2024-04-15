package Collection.set;

import java.util.TreeSet;

// Sorted set is the child interface of set 
// unique objects according to some sorting order
// that sorting order can be default sorting order or customized sorting order

// It can be use as reference only and we uses its methods.

public class SortedSetDemo {
    
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("kunal");
        ts.add("ashu");    
        ts.add("omkar");    
        ts.add("rushi");    
        ts.add("tejas");
        
        System.out.println(ts);

        // [ashu, kunal, omkar, rushi, tejas] 
        // ascending order
        // default sorting order
    }
}
