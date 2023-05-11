class StringDemo{

	public static void main(String[] args){
	
	
		String str1 = "Tejas";               // 100
		String str2 = "Katkade";             // 200
		
		System.out.println(str1 + str2);
		
		String str3 = "TejasKatkade";        // 300
		String str4 = str1 + str2;           // 400

		// str1 + str2  is concat method so new object is created.
		// concat is the method of String class
		    


		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	}
}

