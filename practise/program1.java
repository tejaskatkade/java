//
class Solution {
    static String armstrongNumber(int n){
        // code here
        int armS=0;
        int num = n;
        int c = 0;
        while(num != 0){
            num=num/10;
            c++;
        }
	System.out.println("Length of NUM = "+ c);
        num = n;
        
        while(num != 0){
            int rem = num%10;
	    int mul = 1;
            for(int i=0; i<c; i++){
                mul = mul*rem;
            }
	    System.out.print(mul+" ");
            armS = armS + mul;
            num = num/10;
        }
	System.out.println("arms = "+armS);
        if(armS == n){
            return "Yes";
        }else{
            return "No";
        }
    }
}

class MainDemo{
	public static void main(String [] args){
		int var = 153;
		System.out.println(Solution.armstrongNumber(var));
	}
}
