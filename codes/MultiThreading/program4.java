class MyThread extends Thread{
	public void run(){
		System.out.println("In run.");

		System.out.println(Thread.currentThread().getName());
	}
/*	public void start(){     // DO NOT OVERRIDE start()
		System.out.println("In Start");
		run();
	}
*/
}

class ThreadDemo{
	public static void main(String[] args){
	
		System.out.println(Thread.currentThread().getName());

		MyThread obj = new MyThread();
		System.out.println("1");
		obj.start();

		MyThread obj1 = new MyThread();
		obj1.start();

	}
}
