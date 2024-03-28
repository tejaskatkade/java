// Interface
//
// Not a single method have a body (methods can have body)
// contains 100% abstract methods
// No constructor (As NO default parent exist)
// Object cannot be created
// All methods are public abstract by default
// If there is a abstract class or interface then child class always came in picture.


interface Demo{
	
	void fun();
	void gun();

}

//class Child extends Demo{ // error

class Child implements Demo{
	
	public void fun(){
		System.out.println("fun");
	}	
	public void gun(){
		System.out.println("gun");
	}

}
class Client{

	public static void main(String[] args){
	
		Demo demo = new Child();
		demo.fun();
		demo.gun();
		
	}
}

