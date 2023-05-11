class LoopDemo{

	// This loop is only applied on class
	
	public static void main(String[] args){
	
		int arr[]={10,20,30,40,50};

		for(int i=0; i<arr.length; i++){
		
			System.out.println(arr[i]);
		}
		System.out.println();

		for(int x: arr){         // int is the data type of an array
				 	 // arr is the name of array
			System.out.println(x);
		}
	}
}
