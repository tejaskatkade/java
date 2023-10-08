class Parent{

	int x = 10;
	static int y = 20;
        
	static{
       
		System.out.println("Parent static Block");
        }
	Parent(){
	
		System.out.println("Parent constructor");

	}	
	void methodOne(){
	
		System.out.println(x);
		System.out.println(y);
	}
	static void methodTwo(){
	
		System.out.println(y);
    
	}
}

class Child extends Parent{

	static{
	
		System.out.println("Child static Block");
	}
	Child(){

		System.out.println("Child Constructor");
        }
}
class Client{

	public static void main(String[] args){
	
		Child obj = new Child();
		
		obj.methodOne();
		obj.methodTwo();
	}
}

// Parent static Block
// Child static Block
// Parent constructor
// Child Constructor
// 10
// 20
// 20
