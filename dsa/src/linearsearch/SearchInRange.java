package linearsearch;

public class SearchInRange {
    public static int linearInRange(int[] array, int target,int start, int end ){
        if(end > array.length){
            return -1;
        }
        
        for (int i =start; i<=end; i++) {
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {23,12,10,4,21,22,32,24,20,17,3,34,30,28,18,19};
        int target = 22;
        int index = linearInRange(array, target, 3, 6);
        if(index == -1){
            System.out.println("Element Not Found");    
        }else{
            System.out.println("Element Found at index :"+ index);
        }
    }
}
