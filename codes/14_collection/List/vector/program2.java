// Vector :- default capacity = 10
// Vector doubles its capaciy when get full;
import java.util.*;

class VectorDemo{

	public static void main(String[] args){
	

		Vector v1 = new Vector();
		int cp = v1.capacity();

		System.out.println("Default capacity = "+cp);

		Vector v = new Vector(5);
		
		System.out.println("Capacity = "+v.capacity());
	
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);	

		v.addElement(null);

		System.out.println("Capacity = "+v.capacity());
	}
}
