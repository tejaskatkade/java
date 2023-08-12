import java.util.*;
class MyClass implements Comparable{   //  MyClass cannot be cast to class 
				       //  java.lang.Comparable

	String str = null;
	MyClass(String str){
		this.str = str;
	}

	public int compareTo(Object obj){        //MyClass is not abstract and does not 
						 //override abstract method 
						 //compareTo(Object) in Comparable

		//return str.compareTo(obj.toString());	
		return (this.str).compareTo(obj.toString());	
		//return 1;
		//return -1;
	}

	public String toString(){    // if we do not override toStrign method it prints 
				     // objects
	
		return str;
	}
	
}
class Demo{

	public static void main(String[] args){
	
		TreeSet ts = new TreeSet();
		ts.add(new MyClass("kanha"));
		ts.add(new MyClass("ashish"));
		ts.add(new MyClass("kanha"));
		ts.add(new MyClass("rahul"));

		System.out.println(ts);

	}
	
}
