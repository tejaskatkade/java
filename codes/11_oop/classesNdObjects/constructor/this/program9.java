class Parent{

	Parent(){
		System.out.println("Parent constructor");
	}

}
class Child extends Parent{

	Child(){
		
		System.out.println("Child Default Constructor"); 

	}
	Child(String s){
		//this();
		super();
		System.out.println("Child Parameterised Constructor");
		System.out.println("Name = "+ s);
	}
}

class Demo{
	
	public static void main(String[] args){
		Child obj = new Child("tejas");

	}
}
