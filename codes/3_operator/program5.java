
class Operator{
	public static void main(String[] args){
		int x = 10; 
		int y = 20;

		if(x)     //error
			System.out.println("Hello");
		else
			System.out.println("Hi");
	}
}

//program5.java:7: error: incompatible types: int cannot be converted to boolean
//              if(x)
