// Support indexing also as it is child of List

import java.util.*;

class LinkedListDemo{

	public static void main(String[] args){
	
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);

		System.out.println(ll);

		ll.add(2.25);

		System.out.println(ll);
		
		System.out.print("First :");
		ll.getFirst();
		System.out.println(ll);


		System.out.println("Last :");
		ll.getLast();
		System.out.println(ll);
		

		System.out.println("Remove First");
		ll.removeFirst();
		System.out.println(ll);


		System.out.println("Remove Last");
		ll.removeLast();
		System.out.println(ll);


		System.out.println("AddFirst");
		ll.addFirst(5);
		System.out.println(ll);


		System.out.println("Addlast");
		ll.addLast(55);
		System.out.println(ll);
	}
}
