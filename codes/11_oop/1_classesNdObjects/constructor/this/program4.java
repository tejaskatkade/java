class Demo{

	Demo(){
		System.out.println("Constructor 1");
	}

	Demo(){			//error: constructor Demo() is already defined in class Demo
				// this error is due to method signature which contains method name and parameter
		System.out.println("Constructor 2");
	}

}
