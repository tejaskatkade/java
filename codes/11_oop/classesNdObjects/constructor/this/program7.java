// Calling constructor  from another constructor
// this() calls another constructor of that class

class Demo{

	int x = 10;
	Demo(){
		// this();       //error: recursive constructor invocation
		System.out.println("1");
	}

	Demo(int x){
		
		this();             // calls default constructor 
		System.out.println("2");

	}
	public static void main(String[] args){
	
		Demo obj1 = new Demo();  // calls constuctor 2
	}
}
