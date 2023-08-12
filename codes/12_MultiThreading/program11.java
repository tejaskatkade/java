// join - It can cause Deadlock 
// 				:- if both thread join each other
// 				:- thread can join itself also.

// Therefore better to use join method with parameter.

// Deadlock scenario.
class MyThread extends Thread{

	static Thread mainThread = null;
	public void run(){

		try{
			mainThread.join();
		}catch(InterruptedException ie){
		
		}
		for(int i = 0; i<10; i++)
			System.out.println(getName());
	}
}
class ThreadDemo
{
	public static void main(String args[])throws InterruptedException{
		MyThread.mainThread = Thread.currentThread();

		MyThread obj = new MyThread();
		obj.start();
		
		obj.join();

		for(int i=0; i<10; i++){
			System.out.println("main");
		}
	}
}

