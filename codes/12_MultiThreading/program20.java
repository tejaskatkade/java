// THread POOL

// Base or root 
// 	1. class     : Executors
// 	2. Interface : Executor

import java.util.concurrent.*;
class MyThread implements Runnable{

	int num;
	MyThread(int num){
		this.num = num;
	}

	public void run(){
	
		System.out.println(Thread.currentThread() + "start : " + num);
		dailyTask();
		System.out.println(Thread.currentThread() + "End   : " + num);

	}

	void dailyTask(){
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
		
		}
	}
}
class ThreadPoolDemo{
	public static void main(String[] args){
		ExecutorService ser = Executors.newFixedThreadPool(3);

		for(int i=0; i<9; i++){
			MyThread obj = new MyThread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}

}
