// logical operator

class Operator{
	public static void main(String[] args){
		
		int x = 10; 
		int y = 20;

	//	int ans = x && y;  // error: bad operand types for binary operator '&&'
	
		boolean ans = x<y  && y>x;

		System.out.println(ans);

	}
}
