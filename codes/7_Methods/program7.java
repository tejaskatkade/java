class Demo{

	//void fun(){
	/*
  error: method fun in class Demo cannot be applied to given types;
                obj.fun(10);
                   ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
	*/
	void fun(int x ){
	  	System.out.println();
	}
	public static void main(String[] args){
	
		System.out.println("In main");
		
		Demo obj = new Demo();

		obj.fun(10);
		System.out.println("End main");


	}	
}


