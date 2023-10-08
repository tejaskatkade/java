// Factor code


// Approach 1
// Time complexity o(n)

import java.util.Scanner;
class Factor{

	static int factor(int num){
	
		int count =0;
		for(int i=1; i<=num; i++){
			if(num%i == 0){
				count++;
			}
		}
		return count;
			
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int ans = factor(number);
		System.out.println(ans);
	}
}
