// common array element

import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size (array 1):");		
		
		int N1 = Integer.parseInt(br.readLine());
		int arr1[]=new int[N1];
		
		System.out.println("Enter the size (array 2):");
		
		int N2 = Integer.parseInt(br.readLine());
		int arr2[]=new int[N2];
		
		System.out.println("Enter the array elements(Array 1):");
		for(int i=0; i<N1; i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter the array elements(Array 2):");
		for(int i=0; i<N2; i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Commont elements are:");

		for(int i=0; i<N1; i++){
			for(int j=0; j<N2; j++){
				if(arr1[i]==arr2[j]){
					System.out.print(arr1[i] + " ");
					break;
				}
			}	
		}
	
		System.out.println();
	}
}
