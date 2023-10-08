// Priority Blocking Queue

import java.util.concurrent.*;
class BlockingQueueDemo{

	public static void main(String args[])throws InterruptedException{
	
		BlockingQueue bque = new PriorityBlockingQueue(4);
		
		bque.offer(90);
		bque.offer(80);
		bque.offer(70);
		bque.offer(10);
		bque.offer(20);
		bque.offer(30);


		System.out.println(bque); //[10, 20, 30, 90, 70, 80]

		
		bque.put(50);
	
		System.out.println(bque);//[10, 20, 30, 90, 70, 80, 50] 
		
	}
}
