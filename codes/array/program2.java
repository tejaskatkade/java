class ArrayDemo{

	public static void main(String[] args){
	
		ArrayDemo obj = new ArrayDemo();

		int ret = obj.fun(10);
		System.out.println(ret);  // 60;
	}

	int fun(int x){
	
		int val = x+50;
		return val;	
	}
}
