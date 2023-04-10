// Insert the multiple data having diff datatypes in one line and print it separately


import java.util.*;
import java.io.*;

class IODemo{
	public static void main(String[] tejas)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(" movieName rowName totalTickets totalPrice");

		String info = br.readLine();

		StringTokenizer obj = new StringTokenizer(info," ");

		String token1 = obj.nextToken();
		char token2 = obj.nextToken().charAt(0);
		int token3 = Integer.parseInt(obj.nextToken());
		float token4 = Float.parseFloat(obj.nextToken());
 
		System.out.println(" movieName :"+token1);
		System.out.println(" rowName :"+token2);
		System.out.println(" totalTickets :"+token3);
		System.out.println(" totalPrice :"+token4);




	}

}
