class Demo{

	Demo(){
		System.out.println("Constructor");
		System.out.println(this);       // 100
	}

	Demo(int x){
		System.out.println(x);
		System.out.println(this);	// 200
	}

	Demo(Demo obj){
		System.out.println(obj);        // 100
		System.out.println(this);       // 300
	}

	public static void main(String [] args){
		Demo obj1 = new Demo();          //obj1 = 100
		Demo obj2 = new Demo(10);        //obj2 = 200
		Demo obj3 = new Demo(obj1);      //obj3 = 300

	}
}
