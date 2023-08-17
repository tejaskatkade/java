//Iterator

import java.util.*;

class ArrayListDemo{

	public static void main(String[] args){
	
		ArrayList al = new ArrayList();

		al.add("Kunal");
		al.add("Rushi");
		al.add("Ashu");
		al.add("Omkar");
		al.add("Tejas");

		System.out.println(al);

		for(Object obj: al){
			System.out.print(obj);
		}

		System.out.println();
		
		for(var obj: al){
			System.out.print(obj);
		}

		System.out.println();

		// Iterator (List, Set, Queue)

		System.out.println("Iterator ");

		Iterator itr = al.iterator();

		// [Kunal, Rushi, Ashu, Omkar, Tejas]

		while(itr.hasNext()){
		
			//System.out.print(itr.next());
			
			if("Rushi".equals(itr.next())){
			
				itr.remove();
			}
			
			//System.out.println(itr.next());
			
		}

		System.out.println(al);
	}
}
