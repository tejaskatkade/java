import java.util.concurrent.*;
import java.util.*;

class BlockingQueueDemo{

	public static void main(String args[])throws InterruptedException{
	
		BlockingQueue bque = new ArrayBlockingQueue(4);
		
		bque.put(30);
		bque.put(20);
		bque.put(10);
		bque.put(40);

		System.out.println(bque);  // [30, 20, 10, 40]
		
		//bque.put(50);
		bque.offer(50,3,TimeUnit.SECONDS);

		System.out.println(bque);  // [30, 20, 10, 40]


		System.out.println(bque.take());  // 30
		System.out.println(bque);  // [20, 10, 40]


		// drainTo

		ArrayList al = new ArrayList();
	
		System.out.println("ArrayList = "+ al); // ArrayList = []
		
		bque.drainTo(al);

		System.out.println("ArrayList = "+ al);  //ArrayList = [20,10,30]
		System.out.println(bque);  // []




	}
}
