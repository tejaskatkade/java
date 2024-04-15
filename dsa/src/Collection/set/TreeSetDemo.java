package Collection.set;

import java.util.TreeSet;

// TreeSet
// Underlying data structure is balanced Tree 
// Duplicates are not allowed 
// Insertion order is not preserved but based on some sorting order
// Heterogenous objects are not allowed else we get ClassCastException
// Null insertion is possible only once;


public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("tejas");
        ts.add("yash");
        ts.add("prem");

        System.out.println(ts);
        //[prem, tejas, yash]

        TreeSet ts1 = new TreeSet<>();
        //ts1.add(null); // null pointer exception
        ts1.add(10);
        ts1.add(20);
        // ts1.add("tk"); // ClassCastException

        TreeSet tree = new TreeSet<>();
        tree.add(null);
    }
    
}
