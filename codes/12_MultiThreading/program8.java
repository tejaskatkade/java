// You can not start already started thread.

class MyThread extends Thread{
	public void run(){
		System.out.println("Thread Running");
	}
}
class ThreadDemo{

	public static void main(String[] args){
	
		MyThread obj = new MyThread();
		obj.start();
		//obj.start();  // Exception in thread "main" java.lang.IllegalThreadStateException
         			// at java.base/java.lang.Thread.start(Thread.java:793)
        		  	// at ThreadDemo.main(program8.java:14)
	}
}
