package Collection.set;

import java.util.Comparator;
import java.util.TreeSet;

//If we are not satisfying with default natural sorting order (or) if default natural sorting order is not available then we can define our own customized sorting by Comparator object.



class ComparatorDemp {
    public static void main(String[] args) {
        // TreeSet<Integer> ts = new TreeSet<>();
        // [0, 5, 10, 12]

        TreeSet<Integer> ts = new TreeSet<>(new MyComparator());
        // [12, 10, 5, 0]

        ts.add(12);
        ts.add(10);
        ts.add(0);
        ts.add(5);

        System.out.println(ts);

    }

}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // if (o1 < o2) {
        //     // return -1; // Ascending
        //     return +1; // Descending
        // } else if (o1 > o2) {
        //     return -1;
        // } else {
        //     return 0;
        // }

        //or 

        return o2 - o1;  // descending
    }
}

