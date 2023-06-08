class Demo{

	void fun(Object obj){
		System.out.println("object");
	
	}

	void fun(StringBuffer str){
		System.out.println("String Buffer");
	
	}

}
class Client{

	public static void main(String[] args){
	
		Demo obj = new Demo();
		obj.fun(new StringBuffer("Tejas"));  // StringBuffer
		obj.fun(null);                       // StringBuffer
	}
}

// String Buffer is child class and priority is given to child class
