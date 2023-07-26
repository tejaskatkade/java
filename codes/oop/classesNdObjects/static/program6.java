class Demo{

	int x = 10;          // constructor
	static int y = 20;   // static block

	static{
	
		System.out.println("Static Block");
	}
	public static void main(String[] args){
	
		System.out.println("Main");
	}
}

/*
 
   o/p-

   Static Block
   Main

 */
