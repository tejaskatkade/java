class MethodDemo{

	int x = 10;
	static int y = 20;

	static void fun(){
	
		System.out.println("In Fun;");
	}

	public static void main(String[] args){
	
		MethodDemo obj = new MethodDemo();
		
		System.out.println("x = " + obj.x);
		System.out.println("y = " + y);

		obj.fun();
	}
}

