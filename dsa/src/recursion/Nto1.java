package recursion;

public class Nto1 {
    public static void printNum(int n){

        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(--n);
    }
    public static void main(String[] args) {
        printNum(5);
    }
}
