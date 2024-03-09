package binary;

// Ceiling :    Smallest number greater than or equal to target

public class CeilingNumber {
    public static int ceilingNum(int[] arr, int target){
        
        int start = 0;
        int end = arr.length -1;
        if(target > arr[end]){
            return -1;
        }

        while (start <= end) {
            
            int mid  = start + (end - start)/2;
            if(arr[mid] ==  target){
                return arr[mid];
            }

            if (target < arr[mid]) {
                end = mid - 1;
                
            }else{
                start = mid + 1;
                
            }

        }
        
        return start;
        
    }
    public static void main(String[] args) {
        int arr[] = {3,7,9,12,16,17,19};
        System.out.println(ceilingNum(arr,181));
    }
}
