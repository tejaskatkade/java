class Demo{

	public static void main(String[] args){
		int x = 10;
		int y = 20;
		{
			System.out.println(x +" "+y); //10 20
		}

		{
			x=15;
			System.out.println(x +" "+y); //15 20
		}
	

		System.out.println(x +" "+y);        //15 20
	
	}

}
