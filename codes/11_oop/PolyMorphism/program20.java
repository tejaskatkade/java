// Final Modifier in Overriding

/*
class Parent {

	final void fun(){
	
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
//error:  overridden method is final
*/

class Parent {

	void fun(){
	
		System.out.println("Parent");
	}
}
class Child extends Parent{ 
										
	final void fun(){
		System.out.println("Child");
	}
}
class Client {
	public static void main(String[] t){
	
		Child obj = new Child();
		obj.fun();
	}
}
// Child
