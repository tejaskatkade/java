class Demo{

	public static void main(String[] args){
		int x = 10;
		{

			int x = 20;  
	       		// error: variable x is already defined in method main(String[])
			System.out.println(x);
		}

		{
			int x = 30;
			// error: variable x is already defined in method main(String[])
			System.out.println(x);
		}
	

		System.out.println(x);                 	
	}

}
