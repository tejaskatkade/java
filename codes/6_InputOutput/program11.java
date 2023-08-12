//Scanner class

import java.util.Scanner;
import java.util.StringTokenizer;

class Demo{

	public static void main(String[] tejas){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input");

		//String str = sc.next();
		String str = sc.nextLine();
		// nextLine() is the method in java use to take input of complete line.

		System.out.println(str);

		StringTokenizer st = new StringTokenizer(str," ");


		System.out.println(st.countTokens());
		//countToken() is the method use to count the no. of tokens

		// StringTokenizer is class in util package use to make tokens 
/*
		String str1 = st.nextToken();
		// nextToken is method in StringTokenizer class use to get tokens 
		String str2 = st.nextToken();
		String str3 = st.nextToken();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
*/

		// To make token there is method
		// hasMoreTokens();

		while(st.hasMoreTokens()){
		
			System.out.println(st.nextToken());
		
		}
		
		System.out.println(st.countTokens());
		//countToken() is the method use to count the no. of tokens

	}
}
