// ThreadGroup

class MyThread extends Thread{

	public void run(){
	
		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	} 
}
class ThreadGroup{

	public static void main(String[] args){
	
		MyThread obj = new MyThread();
		obj.start();
		System.out.println(obj.getName());
		obj.setName("tejas");
		System.out.println(obj.getName());

	}
}
