package linearsearch;

public class FindMinNum {

    public static int findMinimumNumber(int[] array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array = {23,12,10,4,21,22,32,24,20,17,3,34,30,28,1,19};
        int minimumNumber = findMinimumNumber(array);
        System.out.println(minimumNumber);
    }
}
