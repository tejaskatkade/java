package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MyList {
    
    public static void main(String[] args){
        ArrayList<Comp> al = new ArrayList<>();
    
        al.add(new Comp(10, "Tejas", 90));
        al.add(new Comp(15, "Sachin",80.88));
        al.add(new Comp(11, "Ram", 50.50));
        

        System.out.println(al);
        
        Collections.sort(al, new SortById());
        System.out.println(al);

        Collections.sort(al, new SortByName());
        System.out.println(al);
        
        Collections.sort(al, new SortBySal());
        System.out.println(al);
        
        
        
    }

}
