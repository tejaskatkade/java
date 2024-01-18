class Demo{

	int x = 10;
	Demo(){
	
		System.out.println(x);         // 10
		System.out.println(this.x);    // 10
	}

	Demo(int x){
	
		System.out.println(x);        // 50
		System.out.println(this.x);   // 10
	
	}
	public static void main(String[] args){
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(50);
	}
}


