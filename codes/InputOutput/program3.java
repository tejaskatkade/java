// InputStreamReader
// It can only read a character

//import java.io.InputStreamReader;
import java.io.*;


class Demo{

	public static void main(String[] args)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);

		//read() is the method in InputStreamReader class which return int and it throws exception.
		
		System.out.println("Enter character: ");
		int ch1 = isr.read();
		
		System.out.println("o/p: "+ ch1);
		
		System.out.println("Enter character: ");
	
		isr.skip(1);
		//skip() is the method use to skip the character (here, the \n is skipped)
		char ch2 = (char)isr.read();  // typecasting to char
		
		System.out.println("o/p: "+ ch2);

	}
}
