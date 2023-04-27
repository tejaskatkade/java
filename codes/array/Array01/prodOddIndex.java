// product of odd index 

import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size:");
		int N = Integer.parseInt(br.readLine());
		int arr[]=new int[N];
		
		int prod = 1;
		System.out.println("Enter the array elements:");
		
		for(int i=0; i<N; i++){
		
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2 != 0){
				prod = prod * arr[i] ;
			}


		}

		System.out.println("Prod :"+prod);
		
	}
}
