package recursion;

public class ProductOfNum {
    public static int productOfNum(int n){
        if(n==1){
            return 1;
        }

        return n * productOfNum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(productOfNum(5));
    }
}

