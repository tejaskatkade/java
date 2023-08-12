class Outer{

	class Inner{
	
		Inner(){
		
			System.out.println("Constructor");
		}
	}
}
class Client{

	public static void main(String[] args){
	
		Outer.Inner  obj = new Outer(). new Inner();
		//Outer obj1 = new Outer();
		//Outer.Inner obj = obj1.new Inner();

	}
}
