//if setName doesnot get priority then name remain unchanged 
//so need to set name at the time of thread creation.

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
		MyThread obj = new MyThread("tejas");
		obj.start();
		System.out.println(obj.getName());
		
		
	}
}
