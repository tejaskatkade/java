class Parent{

	Parent(){
	
		System.out.println("Parent Default");
	}
	Parent(int x){
	
		System.out.println("Parent Para");
	}
}
class Child extends Parent{

	Child(){
	
		System.out.println("Child Default");
	}
	Child(int x){
	
		System.out.println("Child Para");
	}
}

class Test{

	public static void main(String[] args){
	
		Parent obj = new Child(10);

	}

}
