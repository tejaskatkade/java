// mul of digit

class Muldigit{
	public static void main(String[] args){
		int N=6451;
		int temp = N;
		int mul=1;
		if(temp == 0){
		
			System.out.println(0);
		}else{
			while(temp!=0){
				int rem=temp%10;
				mul=mul*rem;
				temp=temp/10;
			}
		}
		System.out.println("Multiplication of the digit in "+N+" is "+mul);
	}
}
