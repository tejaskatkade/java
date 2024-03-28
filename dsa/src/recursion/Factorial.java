package recursion;

public class Factorial {
    public static int factorialOfNum(int n){
        if(n<1){
            return 1;
        }

        return n * factorialOfNum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialOfNum(5));
    }
}
