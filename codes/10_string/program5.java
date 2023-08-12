class StringDemo{

	public static void main(String[] args){
	
	
		String str1 = "Kanha";               //100
		String str2 = "Kanha";               //100
		String str3 = new String("Kanha");   //200
		String str4 = new String("Kanha");   //300
		String str5 = new String("Rahul");   //400
		String str6 = "Rahul";               //500    


		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
	}
}

