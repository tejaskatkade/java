// Enumeration : (legacy)
// - Only on legacy

import java.util.*;
public class EnumerationTest{

	public static void main(String[] args){
	

		Vector v = new Vector();

		for(int i=1; i<=10; i++){
		
			v.addElement(i);
		}

		System.out.println(v);


		// Enumeration
		
		Enumeration c = v.elements();

		System.out.println(c.getClass().getName());  // java.util.Vector$1 
		
		while(c.hasMoreElements()){
		
			System.out.print(c.nextElement() + " ");
		}
		System.out.println();
		
	}
}
