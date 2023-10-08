// thread Priority

class MyThread extends Thread{

	public void run(){
	
		//System.out.println("Child = "+currentThread().getPriority());

		for(int i=0; i<10; i++){
		
			System.out.println("child");
		}
	}
}
class ThreadDemo{

	public static void main(String args[]){
	
		MyThread obj = new MyThread();
		obj.setPriority(10);
		//System.out.println("Parent"+ Thread.currentThread().getPriority());
		obj.start();
		for(int i=0; i<10; i++){
		
			System.out.println("Main");
		}
		
	}
}
