// static Modifier in Overriding

/*
class Parent {

	static void fun(){
	
		System.out.println("Parent");
	}
}
class Child extends Parent{ 
										
	void fun(){
		System.out.println("Child");
	}
}
class Client {
	public static void main(String[] t){
	
		Child obj = new Child();
		obj.fun();
	}
}
//error:    overridden method is static
*/

//--------------------------------------------------------

/*
class Parent {

	void fun(){
	
		System.out.println("Parent");
	}
}
class Child extends Parent{ 
										
	static void fun(){
		System.out.println("Child");
	}
}
class Client {
	public static void main(String[] t){
	
		Child obj = new Child();
		obj.fun();
	}
}
// error: overriding method is static
*/

//-----------------------------------------------------------

class Parent {

	static void fun(){
	
		System.out.println("Parent");
	}
}
class Child extends Parent{ 
										
	static void fun(){
		System.out.println("Child");
	}
}
class Client {
	public static void main(String[] t){
	
		Parent obj = new Child();
		obj.fun();
	}
}
// Here, there is no method overriding
// this is method hiding as both methods are static
// there is no any relation between above two static method
//
