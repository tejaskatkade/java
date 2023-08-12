class Demo{

	static int a = 20;
	static int b = 30;

	static void disp(){
	
		System.out.println(a);
		System.out.println(b);
	}
}
class Client{

	public static void main(String[] args){
	
		System.out.println(Demo.a);
		System.out.println(Demo.b);

		Demo.disp();
	}
}

