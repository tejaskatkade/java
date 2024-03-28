package binary;
// find Target in Rotated sorted array
public class RotetedArray {
    // Normal sorted Array                   :  arr ={1,2,3,4,5,6,7,8,9,10};
    // Rotated Array (3 clockwise rotation)  :  arr ={4,5,6,7,8,9,10,1,2,3};
    

    // way - 1 
    // find pivot i.e. largest. 
    // find in : start to pivot (Ascending sorted array)
    // If not found then
    // find in : pivot + 1 to end (another Ascending sorted array)

    public static int binarySearch(int[] arr, int start, int end, int target){
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            } else if(target < arr[mid]) {
                end = mid -1;
            }else{
                start = mid + 1;                    
            }
        }
        return -1;
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
         
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                return mid;
            }else if (arr[mid] < arr[mid -1]) {
                return mid - 1;
            } else if(arr[mid] < arr[start]){
                end = mid-1;
            }else if(arr[mid] < arr[mid+1]){ // if(arr[mid] > arr[start])
                start = mid + 1;
            }
        }
        return start;
    }
    public static int search(int[] arr, int target){

        int pivot = findPivot(arr);
        if(arr[pivot] == target){
            return pivot;
        }
        else if (target > arr[0]) {
            return binarySearch(arr, 0, pivot,target);
        }
        return binarySearch(arr, pivot+1, arr.length-1,target);
    }
    public static void main(String[] args) {
        int arr[] ={5,6,7,8,9,1,2,3,4};
        System.out.println(search(arr,6));
    }
}
