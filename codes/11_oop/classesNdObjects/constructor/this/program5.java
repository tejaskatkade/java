class Demo{

	int x = 10; // x get initialize in every constructor (See bytecode)

	Demo(){   //Demo(Demo this)
		
		System.out.println("Constructor");
	}

	Demo(int x){  //Demo(Demo this, int x)
		System.out.println("Parameterised");
	}

	public static void main(String[] args){
		Demo obj1 = new Demo();   // Demo(obj);
		Demo obj2 = new Demo(10); // Demo(obj2,10)
	}
}
