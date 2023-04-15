class Demo{

	void fun(int x){
	
		System.out.println(x);
	}
	public static void main(String[] args){
	
		System.out.println("In main");
		
		Demo obj = new Demo();

//		obj.fun();
		/*
  error: method fun in class Demo cannot be applied to given types;
                obj.fun();
                   ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length

*/
		obj.fun(10);
		System.out.println("End main");


	}	
}


