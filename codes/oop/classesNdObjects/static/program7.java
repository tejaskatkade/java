class Demo{

	int x = 10;          // constructor
	static int y = 20;   // static block

	static{
	
		System.out.println("Static Block 1");
	}
	public static void main(String[] args){
	
		System.out.println("Main");
	}
	static{
	
		System.out.println("Static Block 2");
		System.out.println(y);
	}
}

//Static Block 1
//Static Block 2
//20
//Main
