class MyThread extends Thread{

	public void run(){
		for(int i= 0; i<10; i++ ){
		
			System.out.println("In Run");
			
			try{
			
				Thread.sleep(1000);   // throws exception
			}catch(InterruptedException ie){
			
			}
		}
	}

}
class ThreadDemo{

	public static void main(String[] args)throws InterruptedException{
	
		MyThread obj = new MyThread();
		obj.start();

		for(int i=0; i<10; i++){
		
			System.out.println("IN main");
			Thread.sleep(1000);
		}
	}
}
