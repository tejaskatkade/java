package Collection.set;

// Set - interface
// insertion order is not preserved and duplicates are not allowed



import java.util.HashSet;

public class HashsetDemo1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        // create empty hashset with initial capacity 16 and default fill ratio (load factor) 0.75
        
        
        HashSet<String> hs1 = new HashSet<>(20);
        // create empty hashset with initial capacity 20 and default fill ratio (load factor) 0.75

        hs.add(null);
        hs.add("Aniket");
        hs.add("Anil");
        hs.add("Ashu");
        hs.add("Ashu");
        hs.add("Shivam");
        hs.add("Sunny");
        hs.add("Raghav");
        hs.add("Ravi");

        System.out.println(hs);
        
        //[null, Ashu, Raghav, Shivam, Aniket, Ravi, Anil, Sunny]


        // Hashset - underlying data structure is HashTable
        // Insertion order is not preserved and it is based on hash code of the objects.
        

    }
}
