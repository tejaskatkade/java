class ArrayDemo{

	public static void main(String[] args){
	
		ArrayDemo obj = new ArrayDemo();
		
		//System.out.println(obj.fun()); // error: 'void' type not allowed here
		obj.fun();

	}

	void fun(){
	
		System.out.println("In fun");
	}
}
