//Hashset

import java.util.*;
class HashsetDemo{
	
	public static void main(String[] args){
	
		HashSet hs = new HashSet();

		hs.add(10);
		hs.add(20);
		hs.add(new Integer(10));
		hs.add(new Integer(30));

		System.out.println(hs);  // [20, 10, 30]
	}

}
