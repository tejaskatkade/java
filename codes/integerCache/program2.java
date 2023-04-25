class ArrayDemo{

	public static void main(String args[]){
	
		int a = 10;
		int b = 10;
		Integer c = 10;

		Integer z = new Integer(10); 
	
		int d = 128;
		int e = 128;

		
		System.out.println(System.identityHashCode(a));	//1461863265
		System.out.println(System.identityHashCode(b));	//1461863265
		System.out.println(System.identityHashCode(c));	//1461863265
	
		System.out.println(System.identityHashCode(z));	//2060468723
	
		System.out.println(System.identityHashCode(d));	//622488023
		System.out.println(System.identityHashCode(e));	//1933863327

//Note: program2.java uses or overrides a deprecated API.
//Note: Recompile with -Xlint:deprecation for details.

	}
}
