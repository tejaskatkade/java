// print vowel

import java.io.*;
class ArrayDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.println("Enter the size:");
		//int N = Integer.parseInt(br.readLine());
		int N =7;
		char arr[]=new char[N];
		
		
		System.out.println("Enter the 7 characters:");
		
		for(int i=0; i<N; i++){
		
			arr[i]=(char)br.read();
			br.skip(1);
		
		}

		for(int i=0; i<N; i++){
			if(arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' ||arr[i] == 'O' ||arr[i] == 'U' || arr[i] == 'a' || arr[i] == 'e' ||arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				System.out.println(arr[i]);
			}
		}
		
	}
}
