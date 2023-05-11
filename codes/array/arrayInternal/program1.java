// Array

// Array is class and its parent class is Object class
// Array gets memory on heap section.
// Every object has unique number called as IdentityHashCode();

class ArrayDemo{
public static void main(String args[]){
	int arr[] = {10,20,30,40,50};

	System.out.println(arr);

	int arr1[] = {10,20,30,40,50};

	System.out.println(arr1);

	System.out.println(System.identityHashCode(arr));
	System.out.println(System.identityHashCode(arr1));
		
	System.out.println(arr[0]);
	System.out.println(System.identityHashCode(arr[0]));
	
	System.out.println(arr1[0]);
	System.out.println(System.identityHashCode(arr1[0]));
	
	System.out.println(arr1[1]);
	System.out.println(System.identityHashCode(arr1[1]));
	
		
}

}

// here the As the Objects of both array shares the data as data is same 
// hence identityHashCode is same of 10 of both array

//The same data is shared from -128 to 127
//after this separate object is created for the data

//i.e., if the program contains same data (betweem -128 to 127) then insted of storing this data sepatelly jvm store this data in a box or pool called as IntegerCache
