import java.util.*;

class Employee{

	String empName = null;
	float sal = 0.0f;

	Employee(String empName, float sal){
	
		this.empName = empName;
		this.sal = sal;
	}

	public String toString(){
	
		return "{"+ empName +" = "+ sal +"}";
	}
}

class sortByName implements Comparator{

	public int compare(Object obj1, Object obj2){
	
		return ((Employee)obj1).empName.compareTo(((Employee)obj2).empName);
	}
}

class ListSortDemo{

	public static void main(String[] args){
	
		ArrayList al = new ArrayList();

		al.add(new Employee("Kanha",200.0f));
		al.add(new Employee("Rahul",100.0f));
		al.add(new Employee("Sarang",145.0f));
		al.add(new Employee("Mahendra",190.0f));

		System.out.println(al);

		Collections.sort(al,new sortByName());

		System.out.println(al);
	}
}
