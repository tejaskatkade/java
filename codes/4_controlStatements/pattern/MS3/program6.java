/*

print the diff between char
*/


import java.io.*;
class PatternDemo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter char1:");
		char ch1 = (char)(br.read());
		
		br.skip(1);

		System.out.println("Enter char2:");
		char ch2 = (char)br.read();
		
		int diff = ch2 - ch1;	
		if(diff == 0 ){
			System.out.println(" Characters are same ");
		}else{
			System.out.println("Difference between characters are "+ diff);
		}	
			

	}

}
