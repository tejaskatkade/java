// Thread Group 

class MyThread extends Thread{

	MyThread(ThreadGroup tg, String str){
	
		super(tg,str);
	}
	public void run(){
		System.out.println(getName());
		System.out.println(getThreadGroup());	
	}
}
class ThreadDemo{

	public static void main(String[] args){
		
		ThreadGroup ptg = new ThreadGroup("India");

		MyThread t1 = new MyThread(ptg,"Maharashtra");
		MyThread t2 = new MyThread(ptg,"Goa");
		t1.start();
		t2.start();

		ThreadGroup ctg1 = new ThreadGroup(ptg,"Pak");

		MyThread t3 = new MyThread(ctg1,"Karachi");
		MyThread t4 = new MyThread(ctg1,"Lahore");
		t3.start();
		t4.start();

		ThreadGroup ctg2 = new ThreadGroup("Bangla");

		MyThread t5 = new MyThread(ctg2,"Dhaka");
		MyThread t6 = new MyThread(ctg2,"Mirpur");
		t5.start();
		t6.start();
	}
}
