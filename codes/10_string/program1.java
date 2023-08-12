class StringDemo{

	public static void main(String args[]){
		String str1 = "Sinhgad";               // String constant pool
		String str2 = new String("Sinhgad");   // Heap

		char str3[] = {'A','B','C'};

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
