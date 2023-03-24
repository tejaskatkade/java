// A B C
// D E F
// G H I

class Pattern{
	public static void main(String[] args){
		char ch = 'A';
		for(int i=1; i<=9; i++){
		
			System.out.print(ch++ +" ");
				
			if(i%3 == 0){
				System.out.println();
			}


		}


	}
}
