class Demo{

	int x = 10;
	Demo(){                                // Demo(Demo this)
					       //	^
  					       //    data type
	System.out.println("In constructor");
	}

	void fun(){
		System.out.println(x);
	}
	public static void main(String[] args){
	
		Demo obj1 = new Demo();		// calls constructor Demo()
						//		Demo(obj);
		obj1.fun();
	}
}

