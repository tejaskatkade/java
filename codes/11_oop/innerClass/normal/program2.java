class Outer{

	class Inner{
	
		void m1(){
		
			System.out.println("Inner-m1");
		}
	}
	void m2(){
	
		System.out.println("Outer-m2");
	}

	public static void main(String[] args){
	
		// Inner obj = new Inner(); 
		// error: non-static variable this cannot be referenced from a static context
		
		Inner obj = new Outer() .new Inner();
		obj. m1();
	}
}
