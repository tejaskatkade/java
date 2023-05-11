// Passing an array as an argument

class ArrayDemo{

	static void fun(int A[]){
	
		for(int x : A)
			System.out.println(x);
	}
	public static void main(String[] args){
	
		int arr[] = {10,20,30,40,50};

		for(int x : arr)
			System.out.println(x);

		fun(arr);

	}
}
