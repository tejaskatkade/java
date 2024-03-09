// Linear Search
//Find the no. of occurance of B in Array

import java.util.*;
class ArrayDemo{

	static int searchCount(int[] arr, int B){
		int count = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == B){
				count++;
			}
		}

		return count;
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
		System.out.println("Enter B");
		int B = sc.nextInt();
		
		System.out.println( searchCount(arr,B));
	}

}
