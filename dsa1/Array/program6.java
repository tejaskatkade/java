//find the sum of the given range in an array
import java.util.*;

class Array{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Start Index");
		int start =  sc.nextInt();

		System.out.println("End Index");
		int end	= sc.nextInt();

		int sum = 0;
		int arr[] = {10,20,30,40,50,60,70,80,90};
		for(int i= start; i<=end; i++){
			sum = sum + arr[i];
		}	

		System.out.println("Sum "+sum);


	}
}
