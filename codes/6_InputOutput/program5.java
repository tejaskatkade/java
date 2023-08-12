// Input  of integer
import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{
	
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Enter input:");
		int name = Integer.parseInt(br.readLine());

		System.out.println("name :"+ name);
	
	}
}
