// 1. Instance variable = Global non static variable

class Demo{
	int x = 10;		// Instance variable;
}

// - instance varible get stores in constructor.
// - initialises only when come on java stack.


// 2. Instance method

class Demo1{

	int x = 10;
	static int y = 20;
	void fun(){
       		System.out.println(x);
       		System.out.println(y);
       }	
}
// - instance method comes in the last
// - so we can acess everything from instance method.
// - no need to create an object to access instance method from another instance method.
// - Need to create an object to access instance method from static context.


// 3. Instance Block
// - Part of constructor
// - get merge to constructor

class Demo3{
	int x = 10;
//	Demo3(){
		
  //     		System.out.println("Constructor");

//	}
	{
	
       		System.out.println("Instance Block 1");

	}
	public static void main(String[] args){
		Demo3 obj = new Demo3();
		
       		System.out.println("Main");

	} 
//	{
  //     		System.out.println("Instance Block 2");
//	}
}
