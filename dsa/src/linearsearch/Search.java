package linearsearch;

public class Search {
    public static int linearSearch(int[] array, int target){
        for (int i =0; i<array.length; i++) {
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {23,12,10,4,21,22,32,24,20,17,3,34,30,28,18,19};
        int target = 92;
        int index = linearSearch(array, target);
        if(index == -1){
            System.out.println("Element Not Found");    
        }else{
            System.out.println("Element Found at index :"+ index);
        }
    }
}
