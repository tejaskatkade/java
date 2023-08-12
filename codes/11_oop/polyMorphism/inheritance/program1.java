// Inheritance

class Parent{
	
	Parent(){
		
		System.out.println("In parent Constructor");
	}
	void parentProperty(){
		
		System.out.println("Flat, Car, Property");
	}
}
class Child extends Parent{

	Child(){
		System.out.println("In childe constructor");
	}
}
class Client{
	
	public static void main(String[] args){
	
		Child obj = new Child();
		obj.parentProperty();
	}
}
