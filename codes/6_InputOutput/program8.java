

// if bufferedReader closes the connection then will it close the complete connection or not ? 

//Yesss ...!!!

import java.io.*;
class IODemo{

	public static void main(String[] tejas)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter string:");

		String str1 = br1.readLine();
		System.out.println("String 1 :"+str1);
	
		br2.close(); 
				
		System.out.println("Enter character");

		char ch = (char)isr.read();
		System.out.println("char :"+ch);


	}
}
