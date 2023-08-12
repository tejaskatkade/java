// print Digit

class Demo{

	public static void main(String[] args){
	
		int num=6541;
		
		if(num == 0){
			System.out.println(0);
		}else{

			while(num!=0){
				int rem = num%10;
				System.out.println(rem);
				num=num/10;
			}
		}
	}
}
