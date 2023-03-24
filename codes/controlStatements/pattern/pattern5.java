//A 1 A 1
//A 1 A 1
//A 1 A 1

class Pattern{
	public static void main(String[] args){
		char ch = 'A';
                int n = 1;
		for(int i=1; i<=12; i++){
			if(i%2!=0)
				System.out.print(ch +" ");
			if(i%2==0)
				System.out.print(n +" ");
			if(i%4 == 0){
				System.out.println();
			}


		}


	}
}
