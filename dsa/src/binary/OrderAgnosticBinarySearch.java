package binary;

public class OrderAgnosticBinarySearch {
    public static int orderAgnosticBinarySearch(int[] arr, int key){

        int start = 0;
        int end = arr.length -1;

        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        }else{
            isAsc = false;
        }

        while (start <= end) {
            int mid =  start + (end - start)/2;
            if (arr[mid] == key) {
                return mid;
            }
            if(isAsc){
                if (key < arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if (key > arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,10,13,24,36,38,58,60,79,81,90};
        //int[] arr = {100,89,75,63,52,48,21,11,1};
        int key = 81;
        System.out.println(orderAgnosticBinarySearch(arr, key));
    }
}
