// this() and super() should not be written at same time 


class Demo{

	int x = 10;
	Demo(){
	
		System.out.println("1");
	}

	Demo(int x){
			
		System.out.println("2");
//		this();  // error: call to this must be first statement in constructor

	}
	public static void main(String[] args){
		Demo obj = new Demo(10);
	}
}	
