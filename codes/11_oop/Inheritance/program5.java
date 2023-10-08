//super

class Parent{

	int x = 10;
	static int y = 20;
	Parent(){
		System.out.println("Parent");
	}
}
class Child extends Parent{

	int x = 30;
	static int y = 40;
	Child(){
		System.out.println("Child");
	}
	void access(){
	
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{

	public static void main(String[] args){
	
		Child obj = new Child();
		obj.access();
	}
}

// Parent
// Child
// 10
// 20
// 30
// 40
