//Iterator

import java.util.*;

class ArrayListDemo{

	public static void main(String[] args){
	
		ArrayList<String> al = new ArrayList();

		al.add("Kunal");
		al.add("Rushi");
		al.add("Ashu");
		al.add("Omkar");
		al.add("Tejas");

		System.out.println(al);

		for(int i=0; i<al.size(); i++){
		
			System.out.println(al.get(i));
		}

		System.out.println("------------------");

		for(Object obj: al){
			System.out.println(obj);
		}

		System.out.println("------------------");
		

		for(String obj: al){
			System.out.println(obj);
		}

		System.out.println("------------------");
		
		for(var obj: al){
			System.out.println(obj);
		}


		System.out.println("------------------");
		

		// Iterator (List, Set, Queue)

		System.out.println("Iterator ");

		Iterator itr = al.iterator();
		Iterator itr2 = itr;
		Iterator itr3 = itr;
		Iterator itr4 = itr;




		// [Kunal, Rushi, Ashu, Omkar, Tejas]
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("------------------");

		ListIterator itr1 = al.listIterator(al.size());
		while(itr1.hasPrevious()){
		
			System.out.println(itr1.previous());
		}

		System.out.println("------------------");
		
		while(itr2.hasNext()){
		
			//System.out.print(itr.next());
			
			if("Rushi".equals(itr2.next())){
			
				itr.remove();
			}
			
			//System.out.println(itr.next());
			
		}
		System.out.println(al);

		System.out.println("------------------");

		al.forEach((element)->{
		
			System.out.println(element);
		});
		
	}
}
