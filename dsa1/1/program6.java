// find square root


// Approach 3 finding square root ;
// reducing iteration than appraoch 2

import java.util.Scanner;
class Sqrt{
	// function return Square root near to the exact answer.
	static int sqrt(int num){
		int val = 0;
		for(int i = 0; i<= num; i++){
		
			if(i*i <= num){
				val = i;
			}else{
				break;
			}
		}
		return val;
	
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int ans = sqrt(number);
		System.out.println(ans);
	}
}
