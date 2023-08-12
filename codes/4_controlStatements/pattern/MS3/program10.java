/*

print prime number in a given range
*/


import java.io.*;
class PatternDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start:");
		int start = Integer.parseInt(br.readLine());
		
	
		System.out.println("Enter end:");
		int end = Integer.parseInt(br.readLine());
		
		while(end < start){
			System.out.println("End should be greater than start");

			System.out.println("Enter end:");
			end = Integer.parseInt(br.readLine());
		}
		
		
		for(int i=start; i<=end; i++){
			int val=0;
			for(int j=1; j<=i; j++){
	
			
				if(i%j == 0){
					val++;
				}	
			}
			if(val == 2)
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
