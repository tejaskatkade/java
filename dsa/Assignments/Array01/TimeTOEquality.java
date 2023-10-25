// Given an integer array A of size N.
// - In one second, you can increase the value of one element by 1.
// - Find the minimum time in seconds to make all elements of the array

// equal.

package assignments;
import java.util.*;
public class TimeTOEquality {

    public static int equality(int arr[]){
        int diff = 0;

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++){
            diff = diff + (max - arr[i]);
        }
        return diff;
    }
    public static void main(String[] args){
        System.out.println("Enter array size");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }

        System.out.println();
        int ans = equality(arr);
        System.out.println(ans);
    }
}
