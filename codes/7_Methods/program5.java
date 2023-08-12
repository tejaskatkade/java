// Passing values to a function

class MethodsDemo{

	void add(int a, int b){

		int ans = a+b;
		System.out.println("Addition = "+ ans);

	}
	void sub(int a, int b)
	{
		int ans = a-b;
	
		System.out.println("Subtraction = "+ ans);

	}
	void div(int a, int b){
		float ans = a/b;
		System.out.println("Division = "+ ans);

	}

	void mul(int a, int b){
		int ans = a*b;
		System.out.println("Multiplication = "+ans);

	}

	public static void main(String[] args){
	
		int x =10;
		int y =5;
		MethodsDemo obj = new MethodsDemo();

		obj.add(x,y);
		obj.sub(x,y);
		obj.div(x,y);
		obj.mul(x,y);
	}



}
