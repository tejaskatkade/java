/*

WAP to print the addition of factorial of each digit if number 

*/


import java.io.*;
class PatternDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number:");
		int num = Integer.parseInt(br.readLine());
		
		int temp = num;
		int sum =0;

		while(temp!=0){
			int rem = temp%10;
			int fact = 1;
			for(int j=1; j<=rem; j++){
				fact =fact * j;
			}
			sum=sum+fact;

			temp = temp/10;
		}
		System.out.println("Addition is "+sum);
		
	}
}
