// Prefix sum

// inplace
import java.util.*;
class Array{
	
	public static void main(String[] args){
	
		int arr[] = {2,5,3,11,7,9,4};

		System.out.println("Original array");
		for(int x :arr){
			System.out.print(x);
		}
		System.out.println();

		System.out.println("Prefix array");

		for(int i=1; i<arr.length; i++){
			arr[i] = arr[i-1]+ arr[i];
		}

		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();

		System.out.println("Again Original array");
		for(int i = 0; i<arr.length; i++){
			if(i == 0){
				System.out.print(arr[0]+" ");
			}else{
				System.out.print(arr[i]-arr[i-1]+" ");
			}
		}
		System.out.println();

	}
}
