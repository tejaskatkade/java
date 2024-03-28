
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
	
	void fun(int x){
		
		System.out.println("In fun 2");
	}
	
}
class Client{

	public static void main(String[] args){
	
		Parent obj = new Child();
		//obj.fun(10);
	
	}
}
/*
output :-
 error: method fun in class Parent cannot be applied to given types;
                obj.fun(10);
                   ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
1 error

*/
