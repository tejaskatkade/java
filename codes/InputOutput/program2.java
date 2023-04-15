import java.util.Scanner;
class Demo{

	public static void main(String[] args){
	
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter company name: ");
		String str = obj.nextLine();

		System.out.println("Enter employee id: ");
		int id = obj.nextInt();
		
		System.out.println("Enter Salary: ");
		double sal = obj.nextDouble();

		
		System.out.println("Company name = "+ str);
		System.out.println("Employee id = "+ id);
		System.out.println("Salary = "+ sal);

	}
}
