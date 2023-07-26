

class ClassDemo{

	int x = 10;
	static int y;

	static void fun(){
	
		int z = 30; 
		
	}
}

// Global Static variable stores on static block
// static blocks comes first 
// static block comes only when static variable are there

javap -c ClassDemo.class

Compiled from "program3.java"
class ClassDemo {
  int x;

  static int y;

  ClassDemo();  // constructor 
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V 
   // ==>     // Calling constructor of parent class   [ Super() ]
       4: aload_0
       5: bipush        10
       7: putfield      #2                  // Field x:I
      10: return

  static void fun();
    Code:
       0: bipush        30
       2: istore_0
       3: return
}
