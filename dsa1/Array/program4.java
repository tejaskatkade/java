// Second largest Element

class Array{

	public static int secLargest(int[] arr){
	
		int max = Integer.MIN_VALUE;
		int sec = max;
		for(int i = 0; i<arr.length; i++){
		
			if(arr[i]>max){
				sec = max;
				max = arr[i];
			}else if(arr[i]<max && arr[i]>sec){
				sec = arr[i];
			}
			
		}
		return sec;
	}
	public static void main(String[] args){
	
		int arr[]={5,6,8,9,9,7,5};
		int ans = secLargest(arr);
		System.out.println(ans);
	}
}
