// Anonymous inner class

class  Demo{
	int x = 10;
	static int b = 30;
	void marry(){
	
		System.out.println("Disha Patni");
	}
	Demo fun(){
		System.out.println("In fun method");

		return this;
              //return new Demo();
	}
}
class Client{

	public static void main(String[] args){
	
					// parent	  child								
					//   ^		    ^	
		Demo obj = new Demo(){  // Demo obj = new Client$1()
		
			// Anonymous inner class

			void marry(){
			
				System.out.println("Kriti Sanon");

			}
			
		}.fun();

		obj.marry();
	}
}


//see bytecode => javap -c *.class
