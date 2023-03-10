// Unary


class Operator{
	public static void main(String[] args){
		int x = 5;
		int y = 7;

		int ans1 = ++x + x++;
		int ans2 = --y + y--;
		
		System.out.println(ans1);
		System.out.println(ans2);

		System.out.println(x);
		System.out.println(y);

		int ans3 = ++x + y++ + x++;


		System.out.println(ans3);

	}
}
