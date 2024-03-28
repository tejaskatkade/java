package recursion;

public class Step {
    // count steps to conver num zero
    // if even then divide by 2
    // else minus 1

    public static int countSteps(int num, int stepes){

        if(num == 0){
            return stepes;
        }

        if(num%2 == 0){
            return countSteps(num/2,stepes +1);
        }
        return countSteps(num-1, stepes+1);
    }
    public static void main(String[] args) {
        System.out.println(countSteps(14,0));
    }
}
