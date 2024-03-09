//Max Min of an Array
//find the sum of the maximum and minimum elements in the given array

import java.util.*;

class ArrayDemo{

	static int minMax(int[] arr){
	
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
		
			if(arr[i] < min){
			
				min = arr[i];
			}
			if(arr[i] > max){
			
				max = arr[i];
			}
		}
		int ans = min + max;

		return ans;
	} 
	public static void main(String[] args){
	
		System.out.println("Enter the size of array");

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];

		System.out.println("Enter array elements");

		for(int i=0; i<N; i++){
		
			arr[i] = sc.nextInt();
		}

		System.out.println(minMax(arr));
	}

}
