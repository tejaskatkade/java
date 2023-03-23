// add digit

class Adddigit{
	public static void main(String[] args){
		int N=6451;
		int temp = N;
		int sum=0;
		if(temp == 0){
		
			System.out.println(0);
		}else{
			while(temp!=0){
				int rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
			}
		}
		System.out.println("Sum of the digit in "+N+" is "+sum);
	}
}
