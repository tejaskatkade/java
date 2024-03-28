package recursion;

public class CountZero {

    // way -- 1

    public static int count(int num){
        if(num%10 == num){
            return 0;
        }
        int count = 0;
        if(num%10 == 0){
            count++;
        }
        return count + count(num/10);
    }

    // way -- 2

    public static int countZero(int num,int count){
        if(num%10 == num){
            return 0;
        }
        
        if(num%10 == 0){
            return count + 1 + count(num/10);
        }
        return count + count(num/10);
    }
    public static void main(String[] args) {
        System.out.println(count(5000));
        System.out.println(countZero(5000,0));
    }
}
