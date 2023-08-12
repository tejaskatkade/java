// Global variable  = called as instance variable in java.

class CricPlayer{

	int x = 10;             //instance variable (Global variable)
	

	public static void main(String[] args){
		
		int y = 20;     //local variable

		System.out.println(x);
		System.out.println(y);

	}
}
//error: non-static variable x cannot be referenced from a static context
//
//If you want to access any data from the static then that things also need to be static otherwise you have to create object.
