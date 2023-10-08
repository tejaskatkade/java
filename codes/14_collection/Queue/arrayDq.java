// ArrayDeque

import java.util.*;


class DequeDemo{

	public static void main(String[] args){
	
		Deque obj = new ArrayDeque();

		obj.offer(10);
		obj.offer(40);
		obj.offer(20);
		obj.offer(30);

		System.out.println(obj);  // [10, 40, 20, 30]

		obj.offerFirst(5);
		obj.offerLast(50);

		System.out.println(obj);  // [5, 10, 40, 20, 30, 50]

		System.out.println(obj.pollFirst());  // 5
		System.out.println(obj.pollLast());  // 50
		System.out.println(obj); // [10, 40, 20, 30]

		System.out.println(obj.peekFirst());  // 10
		System.out.println(obj.peekLast());   // 30
		System.out.println(obj);  // [10, 40, 20, 30]

		// Iterator

		Iterator itr = obj.iterator();

		while(itr.hasNext()){
		
			System.out.print(itr.next()+" ");
		}

		System.out.println();

		// Descending Iterator
		
		Iterator itr1 = obj.descendingIterator();

		while(itr1.hasNext()){
		
			System.out.print(itr1.next()+" ");
		}
		System.out.println();	

	}
}
