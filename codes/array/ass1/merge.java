// merge array element

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
		System.out.println("array after merge:");

		int arr3[]= new int [N1+N2];

		int i=0;
		int j=0;
		while(i<N1+N2){
			if(i<N1){
				arr3[i]=arr1[i];
				i++;
			}else{
				arr3[i]=arr2[j];
				i++;
				j++;
			}
		
		}

		for(int k=0; k<N1+N2; k++){
		
			System.out.print(arr3[k] + " ");
		}
		System.out.println();
	}
}
