// Buffered Reader

// As the InputStreamReader reads the character only, BufferedReader comes into picture
// BufferedReader is in i0 package
// It has read()

import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter input:");
		
		// String name = br.read(); //error: incompatible types: int cannot be converted to String

		int name = br.read();
		System.out.println("name :"+ name);
		
		br.skip(1);	
		
		System.out.println("Enter input1:");
		String name1 = br.readLine();

		System.out.println("name1 :"+ name1);



	}
}
