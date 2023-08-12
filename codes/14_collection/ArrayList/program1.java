import java.util.*;   // collection is in util package
class ArrayListDemo{
	
	public static void main(String[] args){
	
		ArrayList al = new ArrayList();
		
		// 1. add(Elememt)
		al.add(10);
		al.add(20.5f);
		al.add("tejas");
		al.add(20);

		System.out.println(al);

		// 2. int size();
		System.out.println(al.size());

		// 3. boolean contains(Object);
		System.out.println(al.contains(20));

		//4. E indexOf(Object);	
		System.out.println(al.indexOf("tejas"));

		//5. int lastIndexOf(Object);
		System.out.println(al.lastIndexOf(20.5f));

		//6. E get(int);
		System.out.println(al.get(2));
		
		//7. E set(int,E);
		System.out.println(al.set(2,"Don"));
		
		//8. void add(int,E);
		al.add(4,50);
		System.out.println(al);

		//9. E remove(int);
		al.remove(2);
		System.out.println(al);

		//10. boolean remove(Object);
		System.out.println(al.remove("tejas"));

		ArrayList al1 = new ArrayList();
		al1.add("java");
		al1.add("c");
		al1.add("cpp");

		//11. boolean addAll(Collection);
		//12. boolean addAll(int,Collection);
		
		System.out.println(al.addAll(3,al1));
		System.out.println(al);

		//13. void removeRange(int,int);
		//al.removeRange(2,4);   // error: protected
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
	

	}
}
