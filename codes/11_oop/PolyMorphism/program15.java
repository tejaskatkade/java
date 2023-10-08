// Return type in overriding

// 1. primitive data type as a return type 
// => They are strictly checked


// therefore,   ERROR

class Parent{

	void fun(){
		
		System.out.println("Parent fun");
		//return 10;
	}

}
class Child extends Parent{

	float fun(){
		
		System.out.println("Child fun");
		return 10.5f;
	}
	

}
class Client{

	public static void main(String[] args){
	
		Parent obj = new Child();
		obj.fun();
	}
}


 
