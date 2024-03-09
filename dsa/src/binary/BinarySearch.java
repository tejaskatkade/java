package binary;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key){

        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid =  start + (end - start)/2;
            if (arr[mid] == key) {
                return mid;
            }else if (key < arr[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,15,17,19,20,45,78,87,89,93,100};
        int key = 6;
        System.out.println(binarySearch(arr, key));
    }
}
