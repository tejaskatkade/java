class Demo{

	void fun(Object obj){
		System.out.println("object");
	
	}
	void fun(String str){
		System.out.println("String");	
	
	}
}
class Client{

	public static void main(String[] args){
	
		Demo obj = new Demo();
		obj.fun("Tejas"); // object of String tejas is created on SCP
		obj.fun(null);
	}
}
/*
o/ip :-

String
String

*/

//At this point priority is given to child so no ambiguity. (Object class is parent class of String)
