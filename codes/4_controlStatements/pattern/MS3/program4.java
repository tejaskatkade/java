/*

print even number in jrevers and odd in standard way
take a range from user
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
		
		for(int i=end; i>=start; i--){
		
			if(i%2 == 0){
				System.out.print(i +" ");	
			}
		}
		System.out.println();
		for(int i=start; i<=end; i++){
		
			if(i%2 != 0){
				System.out.print(i +" ");	
			}
		}


	}

}
