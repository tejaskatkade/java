package Collection.set;

import java.util.Comparator;
import java.util.TreeSet;

// Write a program to insert String and StringBuffer objects into the TreeSet where the sorting order is increasing length order. If 2 objects having the same length then consider they alphabetical order.

class  Problem{
    public static void main(String[] args) {
        
        TreeSet<Object> ts = new TreeSet<>(new MyComparator());

        ts.add("TTTT");
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("bb"));
        ts.add("nn");
        ts.add(new StringBuffer("zzz"));

        System.out.println(ts);
    }
}


class MyComparator implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString(); 
        String s2 = o2.toString();
        
        int l1 = s1.length();
        int l2 = s2.length();

        if(l1 == l2 ){
            return s1.compareTo(s2);
        }    
        return l1 - l2;
    }

}
