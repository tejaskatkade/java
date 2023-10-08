// Prefix sum

// sum of multiple substring
import java.util.*;
class Array{
	
	public static void main(String[] args){
	
		int arr[] = {2,5,3,11,7,9,4};
		int psum[] = new int[arr.length]; // prefix array

		psum[0] = arr[0];
		for(int i=1; i<arr.length; i++){

			psum[i] = psum[i-1]+ arr[i];
		}

		System.out.println("Enter the number of queries");
		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt();
		while(q-- > 0){
			System.out.println("Enter start ");
			int s = sc.nextInt();
			System.out.println("Enter End");
			int e = sc.nextInt();

			if(s==0){
				System.out.println(psum[e]);
			}else{
				System.out.println(psum[e]-psum[s-1]);
			}
		}
	}
}
