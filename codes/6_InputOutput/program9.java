// Insert the multiple string data in one line and print it separately


import java.util.*;
import java.io.*;

class IODemo{
	public static void main(String[] tejas)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name , wing ,flat NO");

		String info = br.readLine();

		StringTokenizer obj = new StringTokenizer(info," ");

		//StringTokenizer is class in java in util package
		//it separate data 
		//it has two parameter 1. data whom we breaks
		//		       2. delimeter (anything that separete data e.g. space)
		//it has method nextToken

		String token1 = obj.nextToken();
		String token2 = obj.nextToken();
		String token3 = obj.nextToken();

		// nextToken method breaks the input 
		System.out.println(" name :"+token1);
		System.out.println(" wing :"+token2);
		System.out.println(" flat no :"+token3);




	}

}
