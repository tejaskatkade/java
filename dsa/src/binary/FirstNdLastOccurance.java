package binary;

public class FirstNdLastOccurance {
    public static int firstOccurance(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int firstOccurance = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                firstOccurance = mid;
                end = mid -1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            
        }
        return firstOccurance;
    }
    public static int lastOccurance(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int lastOccurance = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                lastOccurance = mid;
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            
        }
        return lastOccurance;
    }
    public static void main(String[] args) {
        int arr[] ={5,7,7,7,8,8,9};
        System.out.println(firstOccurance(arr,7));
        System.out.println(lastOccurance(arr,7));

    }
}
