// Any changes in function of value of variable can not change it 
// it is call by value 

class ArrayDemo{

	static void fun(int x, int y){
		
		System.out.println(x); 
		System.out.println(y); 
	
		x=x+10;
		y=y+10;

		System.out.println(x); 
		System.out.println(y); 
		
	}
	public static void main(String[] args){
	
		int x = 10;
		int y = 20;

		System.out.println(x); 
		System.out.println(y); 
		
		fun(x,y);

		System.out.println(x); 
		System.out.println(y); 
	
	
	
	
	}


}
