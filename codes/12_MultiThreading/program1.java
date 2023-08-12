class MyThread extends Thread{
	// the overriden run method has public access specifier 
	public void run(){  // overriding method
		for(int i= 0; i<10; i++ ){
		
			System.out.println("In Run");
		}
	}

}
class ThreadDemo{

	public static void main(String[] args){
	
		MyThread obj = new MyThread();
		obj.start();

		for(int i=0; i<10; i++){
		
			System.out.println("IN main");
		}
	}
}
