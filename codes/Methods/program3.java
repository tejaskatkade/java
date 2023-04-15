class MethodsDemo{

	public static void main(String[] args){
		
		//fun();
		// error : non-static method fun() cannot be referenced from a static context
		// Therefore need to create an object
		
		MethodsDemo obj = new MethodsDemo();
		obj.fun();

		
	}

	void fun(){ //Non-Static Method as Static is not written here
	
		System.out.println("In Fun method");
	}	


}
