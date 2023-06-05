class Demo{
	void fun(int x){
	
		System.out.println(x);
	}
	void fun(float y){
	
		System.out.println(y);
	}

	void fun(Demo obj){
	
		System.out.println("In Demo Para");
		System.out.println(obj);
	}

	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun(10);
		obj.fun(10.5f);

		Demo obj1 = new Demo();
		obj1.fun(obj);
	}
}


