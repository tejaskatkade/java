class ArrayDemo{

	public static void main(String args[]){
	
		char ch = 'A';
		int x = 65;

		
		System.out.println(System.identityHashCode(ch)); // 1234
		System.out.println(System.identityHashCode(x));  // 4575


	}
}
