// OVERRINDING

class Parent{

	Parent(){
	
		System.out.println("In Parent Constructor");
	}

	void property(){
	
		System.out.println("Home,shop,land, gold");
	}
	void marry(){
		
		System.out.println("Rashmika Mandana");
	}
}
class Child extends Parent{

	Child(){
		System.out.println("In Child Constructor");
	}
	
	void marry(){
		
		System.out.println("Rajkumari");
	}
	
}
class Client{

	public static void main(String[] args){
	
		Child obj = new Child();
		obj.property();
		obj.marry();
	}
}
/*
output :-
In Parent Constructor
In Child Constructor
Home,shop,land, gold
Rajkumari

*/
