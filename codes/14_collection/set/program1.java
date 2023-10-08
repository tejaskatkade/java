//Hashset

import java.util.*;
class HashsetDemo{
	
	public static void main(String[] args){
	
		HashSet hs = new HashSet();

		hs.add("Kanha");
		hs.add("Rahul");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");
		hs.add("Ashish");

		System.out.println(hs);  // [Rahul, Ashish, Badhe, Kanha]
	}

}
