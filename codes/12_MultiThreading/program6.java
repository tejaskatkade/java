// Using Runable interface

// Runable interface includes run method which is abstract 
// Does not include start method. Therefore we need create object of Thread class.

class MyThread implements Runnable{

	public void run(){
		
		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo{
	public static void main(String[] args){
	
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);  // Thread creation   // creating object of Thread class.
		//		      obj  is of runnable type  => Thread(Runnable e)
		//		              				^
		//		              			    parameterised constructor of  thread class get call	
		t.start();   // start method calls run method 


	}
}
