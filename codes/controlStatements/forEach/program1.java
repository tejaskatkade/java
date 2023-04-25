class LoopDemo{
	public static void main(String[] args){
	
		int arr[]={10,20,30,40,50};

		for(int i=0; i<arr.length; i++){
		
			System.out.println(arr[i]);
		}
		System.out.println();

		for(int x: arr){
			System.out.println(x);
		}
	}
}
