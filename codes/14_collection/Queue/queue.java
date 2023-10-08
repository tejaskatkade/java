// Queue (Interface)

import java.util.*;

class Demo{

	public static void main(String[] args){
	
		Queue que = new LinkedList();
		// here we can't create object of Queue.
		// LinkedList is the child of Queue.

		// offer();

		que.offer(20);
		que.offer(10);
		que.offer(30);
		que.offer(50);
		que.offer(40);

		System.out.println(que);  	    // [20, 10, 30, 50, 40]

		System.out.println(que.poll());     // 20   // remove element
		
		System.out.println(que);  	    // [10, 30, 50, 40]

		System.out.println(que.remove());   // 10    // throws exception
		
		System.out.println(que);  	    // [30, 50, 40]
		
		System.out.println(que.peek());     // 30  // display first element 
		
		System.out.println(que.element());  // 30  // display first element
							   // throws exception
		
		System.out.println(que);  	    // [30, 50, 40]


	}
}
