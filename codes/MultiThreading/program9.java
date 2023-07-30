// Concurrency methods
// 	sleep();  static , throws InterruptedException;
// 	join();   throws InterruptedException;
//	yield();  static

//1. sleep()

class MyThread extends Thread{

	public void run(){  // Overriding run method of Thread Class
	
		System.out.println(Thread.currentThread());  // Thread[Thread-0,5,main]

	}
}
class ThreadDemo{

	public static void main(String[] args)throws InterruptedException{
	
		System.out.println(Thread.currentThread());   //Thread[main,5,main]
		MyThread obj = new MyThread();
		obj.start();   // calling start method of Thread class which is MyThread class due to inheritance

		Thread.sleep(100);  // throws InterruptedException; (compileTime);
		Thread.currentThread().setName("tejas");
		System.out.println(Thread.currentThread());
	}
}
