class ArrayDemo{

	public static void main(String[] args){
		
		char a = 'A';
		char b = 'A';
		Character c = 'A';
			
		System.out.println(System.identityHashCode(a));  //931646587	
		System.out.println(System.identityHashCode(b));	//931646587
		System.out.println(System.identityHashCode(c));	//931646587



	}
}
