package array;

import java.util.Arrays;

public class Reverse {

    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};

        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
