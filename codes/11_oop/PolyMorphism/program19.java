/*
class Parent {

	private void fun(){
	
		System.out.println("Parent");
	}
}
class Child extends Parent{   // Here, there is no concept of overriding
										
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

/*
class Parent {

	private void fun(){
	
		System.out.println("Parent");
	}
}
class Child extends Parent{   // Here also, there is no concept of overriding
										
	private void fun(){
		System.out.println("Child");
	}
}
*/


class Parent {

	void fun(){
	
		System.out.println("Parent");
	}
}
class Child extends Parent{   
										
	private void fun(){
		System.out.println("Child");
	}
}
// error:  attempting to assign weaker access privileges; was package

//BUT,
// If Parent class don't want that his Child can use the method Parent class have 
// For that we can not make that method private as we can not weaker the access priviliges
// so we make it final.

