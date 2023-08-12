// Take an integer as input 
//  print Fizz if it is divisible by 3
//  print Buzz if it is divisible by 5
//  print fizzBuzz if it is divisible by both
//  if not print Not divisible by both


class Dem0{
	public static void main(String[] args){
		int x = 7;

		if(x%3 == 0 && x%5 == 0){
			System.out.println("FizzBuzz");
		}else if(x%3 == 0){
			System.out.println("Fizz");
		}else if(x%5 == 0){
			System.out.println("Buzz");
		}else{
			System.out.println("Not Divisible");
		}
	}
}
