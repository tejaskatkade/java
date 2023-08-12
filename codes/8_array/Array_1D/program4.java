 
class ArrayDemo{

	static void fun(int A[]){
		
		for(int x : A){
			System.out.println(x); 
		}

		A[0]=50; 
			
	}
	public static void main(String[] args){
	
		int arr[] = {10,20,30};
		
		for(int x : arr){
			System.out.println(x);
		}	
		
		fun(arr);
		
		for(int x: arr){
			System.out.println(x); 
		}
	}


}
