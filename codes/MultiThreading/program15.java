 //giving same name to the thread .

class MyThread extends Thread{
	
	MyThread(String str){
		super(str);
	}
	public void run(){
		System.out.println("Thread running..");
	}
}

class ThreadDemo{

	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());	
		MyThread obj = new MyThread("main");
		obj.start();
		System.out.println(obj.getName());
		
		
	}
}
