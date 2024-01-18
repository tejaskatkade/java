class Demo{

	private int x =10;
	static int y = 20;

	private void fun1(){
	
		System.out.println(x);
	}
	void fun2(){
	
		System.out.println(y);
	}
}
class Client{

	public static void main(String[] args){
	
		Demo obj = new Demo();
		//obj.fun1();   //  error: fun1() has private access in Demo
		obj.fun2();
	}
}
