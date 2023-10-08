import java.util.concurrent.*;
class BlockingQueueDemo{

	public static void main(String args[])throws InterruptedException{
	
		BlockingQueue bque = new ArrayBlockingQueue(4);
		
		bque.offer(30);
		bque.offer(20);
		bque.offer(10);
		bque.offer(40);

		System.out.println(bque);  // [30, 20, 10, 40]

		//bque.offer(50);
		bque.put(50);
	
		System.out.println(bque);  // [30, 20, 10, 40]


	}
}
