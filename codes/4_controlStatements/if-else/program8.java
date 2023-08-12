// Electricity bill Problem

// Given an integer input A which represents units of electricity consumed at your house.
// calculate and print the bill amount 
// units <= 100     : Price per unit is 1
// units > 100     : Price per unit is 2

// Input : 50       Output : 50
// Input : 200      Output : 300




class Demo{
public static void main(String[] args){
	
	int A = 105;
	int price = 0;

	

		if(A <= 100){
			price = A;	
		}else{
			price = 2*(A-100) + 100;
		}
		System.out.println("Bill Amount :" + price);
		
	}
}
