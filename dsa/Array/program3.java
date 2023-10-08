// Return count of pair (i,j) with a[i]+a[j] = k

class Test{
	public static int pairSum(int arr[], int k){
		
		int count = 0;
		for(int i=0; i<arr.length-1; i++){
	
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] + arr[j] == k ){
					count++;
				}

			}
		}
		return count;
	}

	public static void main(String[] args){
	
		int arr[]={5,3,2,1,3,4};
		int k = 6;
		int count = pairSum(arr,k);
		System.out.println(count);
	}
}
