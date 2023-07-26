// The data of Outer class can be accessible in Inner class

class Outer{

	int x = 10;
	static int y = 20;

	class Inner{
	
		void m1(){
		
			System.out.println("Inner-m1");
			System.out.println(x);
			System.out.println(y);
			m2();
		}
	}
	void m2(){
	
		System.out.println("Outer-m2");
	}

	public static void main(String[] args){
	
		Inner obj = new Outer().new Inner();
		obj. m1();
	}
}
