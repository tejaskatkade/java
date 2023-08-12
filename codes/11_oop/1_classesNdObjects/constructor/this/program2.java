// All instance method have this parameter

class Demo{
	
	int x = 10;
	Demo(){   // Demo(Demo this)
		System.out.println("In constructor");
		System.out.println("this "+ this);
		System.out.println("this.x "+ this.x);
	}

	public static void main(String args[]){
	
		Demo obj = new Demo();           // Demo(obj);
		
		System.out.println("obj "+obj);
		obj.fun();                       // fun(obj);

	}

	void fun(){
		System.out.println("this "+this);
		System.out.println("x "+x);
	}
}
