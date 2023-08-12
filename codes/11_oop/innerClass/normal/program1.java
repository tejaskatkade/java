// Normal inner class

class Outer
{

	class Inner
	{
		void m1()
		{
		
			System.out.println("In-m1-Inner class");
		}
	}

	// Name of the .class file is => Outer$Inner.class

	void m2()
	{
	
		System.out.println("In-m2-Outer class");
	}
}

class Client
{

	public static void main(String[] args){
	
		Outer obj = new Outer();
		obj.m2();

		//obj.m1(); //error: cannot find symbol 
		//Inner obj = new Inner(); //error: cannot find symbol

		//creating object of Inner class
		Outer.Inner obj1 = new Outer().new Inner();
	// OR
		Outer.Inner obj2 = obj.new Inner();
		//                  ^
		//                Object of outer class
	
		obj1.m1();
	}
}
