// Access specifier in overrinding
//
// Access specifier can affect overriding. assigning weaker access specifier to overriden method is not allowed

class Parent {

	public void fun(){
	
		System.out.println("Parent fun");
	}
}
class Child extends Parent{
	void fun(){
	
		System.out.println("Child fun");
	}

}
class Client{

	public static void main(String[] args){
	
		Parent obj = new Child();
		obj.fun();
	}
}

/*
o/p:- 
error: fun() in Child cannot override fun() in Parent
        void fun(){
             ^
  attempting to assign weaker access privileges; was public
1 error

*/
