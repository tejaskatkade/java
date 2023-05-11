// Divisible by 5 

import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.println("Enter the size:");
		//int N = Integer.parseInt(br.readLine());
		int N= 10;
		int arr[]=new int[N];
		
		System.out.println("Enter the array elements:");
		
		for(int i=0; i<N; i++){
		
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		
		for(int i=0; i<N; i++){
			if(arr[i]%5==0)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
