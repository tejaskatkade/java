class Solution{
	
	static int secLargest(int []arr,int N){
	
		int max = arr[0];
		int prev = arr[0];
		int prev2 = arr[0];

		
		for(int i=1; i < N; i++){

            		if(arr[i] > max){

                		prev = max;
                		max = arr[i];
            		}else if(arr[i] > prev){
                 		if(arr[i] == max){

                		}else{
                		    prev = arr[i];
                		}
            		}else if(max == prev){
            			    prev = arr[i];
            		}
        	}

		return prev;
	}

	public static void main(String args[]){
	
		int [] arr = {99, 99,99, 99,99,99,99,99,99,99,-1};
		int N = 11;
		System.out.println(secLargest(arr,N));
	}
}
