class StringDemo{

	public static void main(String[] args){
	
	
		String str1 = "Tejas";               // 100
		String str2 = "Katkade";             // 200
		
		System.out.println(str1);       // Tejas
		System.out.println(str2);       // Katkade
		
		str1.concat(str2);   // TejasKatkade

		  // concat is method. Here concatination is happened but doesn't get store
		
		System.out.println(str1);       // Tejas
		System.out.println(str2);       // Katkade
		
		
	}
}

