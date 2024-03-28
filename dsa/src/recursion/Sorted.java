package recursion;

public class Sorted {

    public static boolean isSorted(int[] arr, int index){

        if(arr.length-1 == index){
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        
        int[] arr ={1,3,5,6,4,12,15};
        System.out.println(isSorted(arr,0));
    }
}
