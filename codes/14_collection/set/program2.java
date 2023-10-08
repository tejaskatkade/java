//LinkedHashset

import java.util.*;
class LinkedHashsetDemo{
	
	public static void main(String[] args){
	
		LinkedHashSet hs = new LinkedHashSet();

		hs.add("Kanha");
		hs.add("Rahul");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");
		hs.add("Ashish");

		System.out.println(hs);  // [Kanha, Rahul, Ashish, Badhe]
	}

}
