// Static in Inheritance 

class Parent{

	static{
	
		System.out.println("In parent static block");
	}
}
class Child extends Parent{

	static{
		
		System.out.println("In Child");
	}
}
class Client{

	public static void main(String[] args){
	
		Child obj = new Child();
	}
}

// In parent static block
// In Child
