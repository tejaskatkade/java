// find square root


// Approach 1 finding square root of perfect square no;
// Basic approach

import java.util.Scanner;
class Sqrt{

	static int sqrt(int num){
		int i =0 ;
		for( ; i<num ; i++){
		
			if(i*i == num){
			
				break;
			}
		
		}
		
		return i;	
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int ans = sqrt(number);
		System.out.println(ans);
	}
}
