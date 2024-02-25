package comparator;

import java.util.Comparator;

public class SortBySal implements Comparator<Comp>{

    @Override
    public int compare(Comp o1, Comp o2) {
        return (int)(o1.getSal() - o2.getSal());
    }
    
}
