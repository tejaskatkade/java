package binary;

// Ceiling :  Find the Smallest Letter greater than target
// Leetcode : 744
public class CeilingLetter{
    public static char ceilingNum(char[] arr, char target){
        
        int start = 0;
        int end = arr.length -1;
       
        while (start <= end) {
            
            int mid  = start + (end - start)/2;
    
            if (target < arr[mid]) {
                end = mid - 1;            
            }else{
                start = mid + 1;
            }

        }
        
        return arr[start % arr.length];
        
    }
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        System.out.println(ceilingNum(arr,'e'));
    }
}
