class Demo{
	
	//fun(int x)  ==>  error : return type required 
	
	// void fun(int x) ==> error: incompatible types: possible lossy conversion from float to int
	//(data loss is there)
	
	float fun(float x){
	
		System.out.println(x);
		return x+10;
	}
	public static void main(String[] args){
	
		System.out.println("In main");
		
		Demo obj = new Demo();
		double a = obj.fun(10.5f); // Float is converted to double No data loss is there.
		System.out.println("End main");


	}	
}


