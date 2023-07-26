// Static in Normal Inner class

class Outer{

	int x = 10; 
	static int y = 20;
	class Inner{
		int a = 30;
	//	static int b = 40; // error: Illegal static declaration in inner class Outer.Inner
		final static int b = 40;
	}

}
class Client{

	public static void main(String [] args){
		
		System.out.println(Outer.Inner.b);

		System.out.println(new Outer().new Inner().b);

		Outer obj = new Outer();
		System.out.println(obj.new Inner().b);


		

	}
}
