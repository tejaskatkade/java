// TreeSet

import java.util.*;
class TreeSetDemo{

	public static void main(String[] args){
	
		TreeSet ts = new TreeSet();

		ts.add("Kanha");
		ts.add("Ashish");
		ts.add("Rahul");
		ts.add("Badhe");
		ts.add("Kanha");

		System.out.println(ts);  // [Ashish, Badhe, Kanha, Rahul]
	}
}
