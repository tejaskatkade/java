// Interface


interface Demo{

	void fun();
	void gun();

}

abstract class Child1 implements Demo{
	
	public void fun(){
		System.out.println("fun");
	}	
	//public abstract void gun();

}
class Child2 extends Child1{

	public void gun(){
	
		System.out.println("gun");
	}
}
class Client{

	public static void main(String[] args){
	
		Demo demo = new Child2();
		demo.fun();
		demo.gun();
		
	}
}

