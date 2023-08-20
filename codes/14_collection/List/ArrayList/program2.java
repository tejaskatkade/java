import java.util.*;

class ArrayListDemo{

	public static void main(String[] args){
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);

		for(Object obj: al){
			System.out.println(obj);
		}
		
	/*	for(Integer obj: al){
			System.out.println(obj);
		}
*/
		for(var obj: al){
			System.out.println(obj);
		}
	}
}
