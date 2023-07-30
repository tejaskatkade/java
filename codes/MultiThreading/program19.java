// ThreadGroup using Runnable

class MyThread implements Runnable{
	
	public void run(){
		
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(100);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadGroupDemo{

	public static void main(String[] args){
	
		ThreadGroup ptg = new ThreadGroup("India");

		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread t1 = new Thread(ptg,obj1,"Maha");
		Thread t2 = new Thread(ptg,obj2,"Goa");

		t1.start();
		t2.start();
	}
}
