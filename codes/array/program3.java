class ArrayDemo{

	public static void main(String[] args){
	
		int arr1[] ={10,20,400};
		int arr2[] ={10,20,400};
		Integer arr3[] ={10,20,400};
		
		System.out.println(System.identityHashCode(arr1[0]));  //100
		System.out.println(System.identityHashCode(arr2[0]));  //100
		System.out.println(System.identityHashCode(arr3[0]));  //100
		System.out.println(System.identityHashCode(arr1[1]));  //200
		System.out.println(System.identityHashCode(arr2[1]));  //200
		System.out.println(System.identityHashCode(arr3[1]));  //200
		System.out.println(System.identityHashCode(arr1[2]));  //300
		System.out.println(System.identityHashCode(arr2[2]));  //400
		System.out.println(System.identityHashCode(arr3[2]));  //500
	
	}
}
