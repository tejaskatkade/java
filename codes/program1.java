import java.util.*;
class MyClass implements Comparable{

	String str = null;
	MyClass(String str){
		this.str = str;
	}

	public int compareTo(Object obj){
		return (this.str).compareTo(obj.toString());
	}
	
	public String toString(){
	
		return str;
	}
}
class Demo{

	public static void main(String[] args){
	
		TreeSet ts = new TreeSet();
		ts.add(new MyClass("kanha"));
		ts.add(new MyClass("ashish"));
		ts.add(new MyClass("rahul"));
		ts.add(new MyClass("badhe"));

		System.out.println(ts);

	}
	
}
