// Priority of Thread
// method used :- getPriority();  by default priority is 5 .
// 	priority ranges between 0 to 10. else it throws exception java.lang.IllegalArgumentException
// 	min priority = 0;
// 	max priority = 10;
//   setPriority() is use to change the priority.

class MyThread extends Thread{

	public void run(){
	
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}
class ThreadDemo{

	public static void main(String[] args){
	
		Thread t = Thread.currentThread();
		// currentThread() - This method returns object

		System.out.println(t.getPriority());


		MyThread obj = new MyThread();
		obj.start();

		t.setPriority(7);

		MyThread obj1 = new MyThread();
		obj1.start();
	}
}
