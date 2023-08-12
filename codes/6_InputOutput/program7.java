import java.io.*;
class IODemo{

	public static void main(String[] tejas)throws IOException{
	
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter string:");

		String str1 = br1.readLine();
		System.out.println("String 1 :"+str1);
	
		br2.close();   //Exception in thread "main" java.io.IOException: Stream closed
		//br2.close closes the connection of jvm with the keybord usin close method
		//hence it throw exception for the input line of str2
		

		// default exception handler does the work of giving exception;
			
		System.out.println("Enter string:");

		String str2 = br2.readLine();
		System.out.println("String 2 :"+str2);


	}
}
