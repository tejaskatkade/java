package Collection.set;

// LinkedHashSet and LinkedHashMap commonly used for implementing “cache applications” where insertion order must be preserved and duplicates are not allowed.

import java.util.LinkedHashSet;

public class LinkedHashsetDemo2 {
    public static void main(String[] args) {
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // LinkedHashSet - child class of HashSet
        // underlying data structure is combination of LinkedList and HashTable
        // Insertion order is preserved


        lhs.add("Karan");
        lhs.add("Suraj");
        lhs.add("Kartik");
        lhs.add("Vinayk");
        lhs.add("Tanmay");
        lhs.add("Satish");

        System.out.println(lhs);

        // [Karan, Suraj, Kartik, Vinayk, Tanmay, Satish]
        // insertion order is preserved
    }
}
