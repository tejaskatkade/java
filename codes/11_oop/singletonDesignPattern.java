// To avoid creating object outside the class we are making constructor private.
// Singleton design pattern

class Singleton{
	static Singleton singleton = new Singleton();
	private Singleton(){
	
		System.out.println("constructor");
	}
	static Singleton getObject(){
	
		return singleton;
	}
}
class Client{

	public static void main(String[] args){
	
		System.out.println("Singleton Design Pattern");

		Singleton obj1 = Singleton.getObject();
		System.out.println(obj1);

		Singleton obj2 = Singleton.getObject();
		System.out.println(obj2);

		Singleton obj3 = Singleton.getObject();
		System.out.println(obj3);

	}
}

