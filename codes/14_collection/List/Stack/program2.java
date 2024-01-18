//Enumeration

import java.util.*;

class StackDemo{

	public static void main(String[] args){
	
		Stack<Integer> s = new Stack();
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		s.push(500);


		System.out.println(s);

		 
		Enumeration i = s.elements();
		System.out.println(i.getClass().getName());

		while(i.hasMoreElements()){
		
			System.out.println(i.nextElement());
		}

	}
}
