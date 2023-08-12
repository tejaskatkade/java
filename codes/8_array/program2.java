// Passing an array as an argument

class ArrayDemo{

	static void fun(int A[]){
	
		for(int i=0; i<A.length; i++)
			A[i] = A[i] + 100;
	}
	public static void main(String[] args){
	
		int arr[] = {10,20,30,40,50};

		for(int x : arr)
			System.out.println(x);

		fun(arr);
		
		for(int x : arr)
			System.out.println(x);


	}
}
