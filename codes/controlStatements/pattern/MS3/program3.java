/*

5 4 3 2 1
8 6 4 2
9 6 3
8 4
5

*/


import java.io.*;
class PatternDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of rows:");
		int row = Integer.parseInt(br.readLine());

		int a = row;
		for(int i=1; i<=row; i++){
			int num = a*i;
			a--;
			for(int j=1; j<=row-i+1; j++){
				System.out.print(num + " ");
				num=num-i;	
			}
			System.out.println();
		}
	}
}
