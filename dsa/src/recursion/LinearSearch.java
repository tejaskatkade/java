package recursion;

public class LinearSearch {
    public static boolean search(int[] arr, int target, int index){

        if(arr.length == index){
            return false;
        }
        return arr[index] == target || search(arr, target, index+1); 

    }
    public static int search1(int[] arr, int target, int index){

        if(arr.length == index){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return search1(arr, target, index+1); 

    }
    public static void main(String[] args) {
        int arr[]={3,5,73,9,26,23,41,20,12};
        System.out.println(search(arr,1,0));
        System.out.println(search1(arr,1,0));
    }
}
