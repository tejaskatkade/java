// Carry Forward

// Left max array

class Array{

	public static void main(String args[]){
	
		int arr[] = {-3,6,2,4,5,2,8,-9,3,1};

		int n = 10;

		for(int x :arr){
			System.out.print(x);			
		}
		System.out.println();

		int leftMax[] = new int[n];
		int  max = Integer.MIN_VALUE;	

		for(int i=0; i<n; i++){
		
			if(arr[i]>max){
				max = arr[i];
			}else{
				arr[i] = arr[i-1];
			}
		}
		for(int x :arr){
			System.out.print(x);			
		}
		System.out.println();


	}
}
