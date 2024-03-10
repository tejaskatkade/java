package binary;
// leetcode 1095
public class FindInMountain {

    public static int peakSearch(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    public static int orderAgnosticSearch(int[] arr,int target, int start, int end, boolean isAsc){

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
        
    }
    public static int search(int[] arr, int target){
        int pivot = peakSearch(arr);
        int answer = orderAgnosticSearch(arr, target, 0, pivot, true);
        if(answer != -1){
            return answer;
        }
        return orderAgnosticSearch(arr, target, pivot+1, arr.length-1, false);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,3,2,0};
        System.out.println(search(arr,4));
        //System.out.println(search(arr,6));
        
    }

}
