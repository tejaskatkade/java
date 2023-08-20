//stack

import java.util.*;

class StackDemo{

	public static void main(String[] args){
	
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);


		System.out.println(s);             // [10, 20, 30, 40]
		
		System.out.println(s.pop());       // 40
		
		System.out.println(s.peek());      // 30

		System.out.println(s.empty());     // false

		
		System.out.println(s);	           // [10, 20, 30]

		System.out.println(s.search(20));  // 2


	}
}
