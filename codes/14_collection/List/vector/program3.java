// Methods of vector

import java.util.*;

class VectorDemo{


	public static void main(String[] args){
	
		Vector v = new Vector();

		for(int i=1; i<6; i++){
			
			v.addElement( i );

		}
		System.out.println(v);

		System.out.println(v.elementAt(0));
		
		System.out.println(v.firstElement());

		System.out.println(v.lastElement());

		System.out.println(v.size());

		System.out.println(v.capacity());

		Enumeration i = v.elements();

		while(i.hasMoreElements()){

			System.out.println(i.nextElement());

		}

		System.out.println(v.removeElement(1));

		v.removeElementAt(1);

		System.out.println(v);
		
		v.removeAllElements();
		System.out.println(v);
		


	}
}
