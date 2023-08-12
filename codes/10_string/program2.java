class StringDemo{

	public static void main(String args[]){

		String str1 = "Sinhgad";               // String constant pool
		String str2 = new String("Sinhgad");   // Heap

	
		System.out.println(System.identityHashCode(str1));   // 100
		System.out.println(System.identityHashCode(str2));   // 200
			
		String str3 = "Sinhgad";               // String constant pool
		String str4 = new String("Sinhgad");   // Heap


		System.out.println(System.identityHashCode(str3));   // 100
		System.out.println(System.identityHashCode(str4));   // 300
	}
}

// New separate objects are created for str2 and str4
