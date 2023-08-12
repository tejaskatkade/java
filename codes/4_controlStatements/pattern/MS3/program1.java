/*

Enter number of rows:
4
D4 C3 B2 A1
A1 B2 C3 D4
D4 C3 B2 A1
A1 B2 C3 D4

*/


import java.io.*;
class PatternDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of rows:");
		int row = Integer.parseInt(br.readLine());
		

		for(int i=1; i<=row; i++){
			int num = row;
			int ch1 = 65;
			int ch2 = 64+row ;
			for(int j=1; j<=row; j++){
			
				if(i%2 == 0){
					System.out.print((char)(ch1) +""+ j+" " );
					ch1++;
					
				}else{
					System.out.print((char)(ch2) +""+ num-- + " ");
					ch2--;
				}
			}
			System.out.println();
		}
	}
}
