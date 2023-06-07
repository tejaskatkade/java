
class Parent{

	Parent(){
	
		System.out.println("In Parent Constructor");
	}
	void fun(){
		
		System.out.println("In fun 1");
	}
}
class Child extends Parent{

	Child(){
		System.out.println("In Child Constructor");
	}
	
	void fun(){
		
		System.out.println("In fun 2");
	}
	
}
class Client{

	public static void main(String[] args){
	
		Parent obj = new Child();
		obj.fun();
	
	}
}
/*
output :-

In Parent Constructor
In Child Constructor
In fun 2
*/
