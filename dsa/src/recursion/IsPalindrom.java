package recursion;

public class IsPalindrom {
    public static int helper(int num, int digit){

        if(num %10 ==  num){
            return num;
        }
        
        return num%10 * (int)Math.pow(10, digit-1) + helper(num/10, digit-1);
    }
    public static int rev(int n){
        int digit = (int) Math.log10(n) + 1;
        //System.out.println(digit);
        return helper(n,digit);
    }

    public static boolean isPalindrom(int num){
        return (num == rev(num));
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(1221));
    }
}
