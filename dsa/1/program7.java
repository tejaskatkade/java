// find square root


// Approach 4 finding square root ;
// optimize

import java.util.Scanner;
class Sqrt{
	
	static int sqrt(int num){
		int start = 1;
		int end = num;
		int mid = 0;
		
		// Binary search
		while(start <= end){
		
			mid = (start + end)/2;

			sqr = mid * mid;

			if(sqr > num){
				end = mid - 1;
			}else if(sqr < num){
				start = mid + 1;
			}else if(sqr == num){
				return sqr
			}
		}
	
	
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int ans = sqrt(number);
		System.out.println(ans);
	}
}
