package comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Comp>{

    public int compare(Comp o1, Comp o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
    
}
