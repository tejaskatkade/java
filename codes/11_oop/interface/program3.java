// Multiple Inheritance

interface Demo1{

	void fun();
}
interface Demo2{
	
	void fun();
}

class DemoChild implements Demo1, Demo2{
	
	public void fun(){
		System.out.println("fun");
	}	
	
}

class Client{

	public static void main(String[] args){
	
		Demo1 demo = new DemoChild();
		demo.fun();
	
		
	}
}

