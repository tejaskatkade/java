// Take input string, character, integer, float and double

import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter string:");
		String name = br.readLine();
		System.out.println("String :"+ name);
		
		System.out.println("Enter character:");
		char ch = (char)br.read();
		System.out.println("Character :"+ ch);

		br.skip(1);


		System.out.println("Enter Integer:");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Integer :"+ num);


		System.out.println("Enter float:");
		float num1 = Float.parseFloat(br.readLine());
		System.out.println("Float :"+ num1);
	
		System.out.println("Enter Double:");
		double num2 = Double.parseDouble(br.readLine());
		System.out.println("double :"+ num2);
	
	}
}
