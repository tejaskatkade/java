package binary;

//// Floor :    Greatest number smaller than or equal to target
public class FloorNumber {
    public static int ceilingNum(int[] arr, int target){
        
        int start = 0;
        int end = arr.length -1;
        if(target < arr[0]){
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
    
        return arr[end];
        
    }
    public static void main(String[] args) {
        int arr[] = {3,7,9,12,16,17,19};
        System.out.println(ceilingNum(arr,1));
    }
}
