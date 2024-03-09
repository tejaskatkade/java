// Factor code


// Approach 2
// Time complexity o(n/2)

import java.util.Scanner;
class Factor{

	static int factor(int num){
	
		int count = 0;
		for(int i=1; i<=num/2 ; i++){
			if(num%i == 0){
				count++;
			}
		}
		return count + 1;
			
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int ans = factor(number);
		System.out.println(ans);
	}
}
