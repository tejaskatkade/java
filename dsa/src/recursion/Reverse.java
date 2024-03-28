package recursion;

public class Reverse {

    // way -- 1
    static int sum = 0;
    public static void reverse(int n) {
        if (n == 0) {
            return;
        }
        sum = sum * 10 + n % 10;
        reverse(n / 10);
    }

    // way -- 2

    public static int helper(int num, int digit){

        if(num %10 ==  num){
            return num;
        }
        
        return num%10 * (int)Math.pow(10, digit-1) + helper(num/10, digit-1);
    }
    public static int rev(int n){
        int digit = (int) Math.log10(n) + 1;
        System.out.println(digit);
        return helper(n,digit);
    }
    public static void main(String[] args) {
        reverse(54321);
        System.out.println(sum);

        System.out.println(rev(54321));
    }
}
