
class Parent{

	Parent(){
	
		System.out.println("In Parent Constructor");
	}
	void fun(){
		
		System.out.println("In fun");
	}
}
class Child extends Parent{

	Child(){
		System.out.println("In Child Constructor");
	}
	
	void gun(){
		
		System.out.println("In gun");
	}
	
}
class Client{

	public static void main(String[] args){
	
		Parent obj = new Child();
		obj.fun();
		//obj.gun();
	}
}
/*
output :-

error: cannot find symbol
                obj.gun();
                   ^
  symbol:   method gun()
  location: variable obj of type Parent
1 error
error: compilation failed

At compilation time compiler binds  the method of parent class but at compilation it call child class methods

*/
