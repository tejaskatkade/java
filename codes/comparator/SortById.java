package comparator;

import java.util.Comparator;

public class SortById implements Comparator<Comp>{

    

    @Override
    public int compare(Comp o1, Comp o2) {
    
        return o1.getId() - o2.getId();
    }
    
}
