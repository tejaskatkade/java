// Return type in overriding

// 2. classes data type as a return type 
// => if class are covariant then they works else it doesnot


class Parent{

	Object fun(){
		
		System.out.println("Parent fun");
		return new Object();
	}

}
class Child extends Parent{

	String fun(){
		
		System.out.println("Child fun");
		return null;
	}
	

}
class Client{

	public static void main(String[] args){
	
		Parent obj = new Child();
		obj.fun();
	}
}

//  child fun



/*
class Parent{

        StringBuffer fun(){
                System.out.println("Parent fun");
                return new StringBuffer("Tejas");
        }

}
class Child extends Parent{

        String fun(){

		System.out.println("Child fun");
                return null;
        }

} 
class Client{

        public static void main(String[] args){

                Parent obj = new Child();
                obj.fun();
        }
}
// error  : return type String is not compatible with StringBuffer

*/
