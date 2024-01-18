// static variable is in method area which is common

class Employee{

	int empID = 101;         // instance var
	String name = "Kanha";   // instance var

	static int count = 51;       // static var - common for every object

	void empInfo(){
	
		System.out.println("ID = "+ empID);
		System.out.println("Name = "+ name);
		System.out.println("Total employee = "+ count);
	}
}
class Demo{


	public static void main(String[] args){
	
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.empInfo();
		emp2.empInfo();

		System.out.println("---------------");

		emp2.empID = 201;
		emp2.name = "Ashish";
		emp2.count = 101;

		emp1.empInfo();
		emp2.empInfo();


	}
}
