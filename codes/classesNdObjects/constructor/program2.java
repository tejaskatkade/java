

class ClassDemo{

	int age  = 10;   

	static void fun(){
	
		int x = 10; 
		
	}
}

//Bytecode for above file

/*
javap -c ClassDemo.class
Compiled from "program2.java"
class ClassDemo {
  int age;

  ClassDemo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #2                  // Field age:I
      10: return

  static void fun();
    Code:
       0: bipush        10
       2: istore_0
       3: return
}

*/
