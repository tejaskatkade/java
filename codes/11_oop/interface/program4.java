// From java 1.8v java allowed to write  body to interface
// static and default <- these keywords are use



interface Demo1{

	void fun();                 // public abstract void fun();
	default void gun(){         // public default void gun();
		System.out.println("gun");	
	}
	static void run(){          // public static void run(){}
		System.out.println("run");	
	}
}
class Child implements Demo1{
	
	public void fun(){
		System.out.println("fun");
	
	}	
	
}

class Client{

	public static void main(String[] args){
	
		Demo1 demo = new DemoChild();
		demo.fun();
		demo.gun();
	//	demo.run(); // error
	
		
	}
}

