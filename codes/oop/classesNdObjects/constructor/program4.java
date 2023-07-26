class A{

	int x = 10;

	A(){  // gets call automatically when object is created.
		System.out.println("In constructor");
	}

	public static void main(String[] args){
	
		System.out.println("main method");

		A obj = new A();  // calls constructor automatically

		System.out.println(obj.x);
		System.out.println(obj.y);


	}
	int y = 30;
}
