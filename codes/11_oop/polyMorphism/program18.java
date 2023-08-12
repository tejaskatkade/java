// Access specifier in overrinding


class Parent {

	void fun(){
	
		System.out.println("Parent fun");
	}
}
class Child extends Parent{
	public void fun(){    // here, we are not weakning access specifier
	
		System.out.println("Child fun");
	}

}
class Client{

	public static void main(String[] args){
	
		Parent obj = new Child();
		obj.fun();
	}
}

/*
o/p:- 

Child fun
*/
