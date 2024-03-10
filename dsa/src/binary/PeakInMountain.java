package binary;
// leetcode : 852 , 162, 

public class PeakInMountain {
    //way - 1
    public static int peakNumber1(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int peak = Integer.MIN_VALUE;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > peak){
                peak = arr[mid];
            }

            if (arr[mid] < arr[mid + 1]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return peak;
    }

    // way - 2
    public static int peakNumber2(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid+1;
            }else{
                end = mid;
                //here mid can be the peak element
                // so we can not use (mid-1)
            }
        }

        return arr[start]; // the loop will end when start = end; 
                      // so start and end both are at peak element
    }
    
    public static void main(String[] args) {
        int arr[] = {5,4,3};
        System.out.println(peakNumber1(arr));
        System.out.println(peakNumber2(arr));
        
    }
}
