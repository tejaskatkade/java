// Static in Inheritance 

class Parent{
	static int x = 10;
	static{
	
		System.out.println("In parent static block");
	}
	static void access(){
	
		System.out.println(x);
		
	}
}
class Child extends Parent{

	static{
		
		System.out.println("In Child");
		System.out.println(x);
		access();	

	}
}
class Client{

	public static void main(String[] args){
	

		System.out.println("Main Method");
		
		Child obj = new Child();
	}
}

// Main Method
// In parent static block
// In Child
// 10
// 10
