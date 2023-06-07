// we can call only parents's method on parents's refrence

class Parent{

	Parent(){
	
		System.out.println("In Parent Constructor");
	}

	void fun(){
	
		System.out.println("In fun Method");
	}
	
}
class Child extends Parent{

	Child(){
		System.out.println("In Child Constructor");
	}
	
	void gun(){
		
		System.out.println("In gun Mehod");
	}
	
}
class Client{

	public static void main(String[] args){
	
		Child obj1 = new Child();
		obj1.fun();
		obj1.gun();  

		Parent obj = new Parent(); 
		obj.fun();                 
		//obj.gun(); // error: cannot find symbol
	}
}
/*
output :-
In Parent Constructor
In Child Constructor
In fun Method
In gun Mehod
In Parent Constructor
In fun Method

*/

//Although child class doesnot contain fun method, we can call it as it is available in child class due to its parents But we get an error for gun as it is not available in method table of parent class
