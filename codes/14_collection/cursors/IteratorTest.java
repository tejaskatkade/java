// Iterator 
// - Universal cursor
// - can read and remove


import java.util.*;

class IteratorDemo{

	public static void main(String[] args){
	
		ArrayList al = new ArrayList();

		for(int i=1; i<=6; i++){
		
			al.add(i);
		}

		System.out.println(al);
		
		Iterator i = al.iterator();

		
		System.out.println(i.getClass().getName());  // java.util.ArrayList$Itr
		

		while(i.hasNext()){
		
			System.out.println(i.next());
			
		}

		i.remove();
		System.out.println(al);
		

	}
} 
