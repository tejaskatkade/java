// super() - use to call parents's class constructor

class Parent{

	int a = 10;
	Parent(){
		
		System.out.println("Parent class constructor");
	}
	Parent(int x){

		System.out.println("Parent constructor");
	}
	void m1(){
		System.out.println("parent m1");
	}
}
class Child extends Parent{


	int b = 10;
	Child(){
		super();
		System.out.println("Child class constructor");
	}
	Child(int x){
		this();  // calls default constructor of same class
		System.out.println("Child constructor");
	}
	void m1(){
		//super(); error: call to super must be first statement in constructor
		System.out.println("Child m1");
	}
}

class Client{

	public static void main(String[] args){
	
		Parent obj = new Child(5);
		obj.m1();
	}
}
