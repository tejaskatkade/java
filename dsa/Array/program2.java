// Given array of size n
// Count number of elements having atleast 1 element greater than itself

class Array{
	public static int countElement(int[] arr){
	
		int n = arr.length;
		int max = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0; i<n; i++){
			if(arr[i]>max){
				max = arr[i];
				count = 0;
			}
			if(arr[i] == max){
				count++;
			}

		}
		return (n - count);
	}

	public static void main(String [] args){
		int arr[] = {5,4,3,2,3,7,1,7,6};
		int  ans = countElement(arr);
		System.out.println(ans);
	}
}
