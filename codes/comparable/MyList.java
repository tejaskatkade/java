package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MyList {
    
    public static void main(String[] args){
        ArrayList<Comp> al = new ArrayList<>();
    
        al.add(new Comp(10, "Tejas", 80));
        al.add(new Comp(11, "Ram", 50.50));
        al.add(new Comp(15, "Sachin",80.88));

        System.out.println(al);

        Collections.sort(al);

        System.out.println(al);
        
    }

}
