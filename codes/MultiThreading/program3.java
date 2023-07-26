class MyThread extends Thread{
	public void run(){
		System.out.println("In run.");

		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo{
	public static void main(String[] args){
	
		System.out.println(Thread.currentThread().getName());

		MyThread obj = new MyThread();
		obj.start();

		MyThread obj1 = new MyThread();
		obj1.start();

	}
}
