// Factor code


// Approach 3    OPTIMIZED APPROACH
// Time complexity o(sqrt(n))

import java.util.Scanner;
class Factor{

	static int factor(int num){
	
		int count =0;
		for(int i=1; i*i <= num; i++){
			
			if(num%i == 0){
				if(i == num/i){
					count = count + 1;
				}else{
					count = count + 2;
				}
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
