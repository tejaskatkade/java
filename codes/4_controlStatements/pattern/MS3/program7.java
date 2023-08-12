/*
Enter number of rows: 4

10
I H
7 6 5
D C B A

Enter number of rows: 5

O
14 13
L K J
9 8 7 6
E D C B A

*/


import java.io.*;
class PatternDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of rows:");
		int row = Integer.parseInt(br.readLine());
		
		int num = (row*(row+1))/2;
		int ch = (row*(row+1))/2 + 64;


		for(int i=1; i<=row; i++){
	
			for(int j=1; j<=i; j++){
				if(row%2 != 0){
				
					if(i%2 != 0){
					
						System.out.print((char)ch+" ");
						ch--;
						num--;
					}else{
						System.out.print(num+ " ");
						ch--;
						num--;
					}

				}else{
					if(i%2 != 0){
					
						System.out.print(num+" ");
						ch--;
						num--;
					}else{
						System.out.print((char)ch+ " ");
						ch--;
						num--;
					}

				
				}
			}
			System.out.println();
		}
	}
}
