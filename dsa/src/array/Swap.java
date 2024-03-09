package array;

import java.util.Arrays;

public class Swap {

    public static void swapIndex(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }
    public static void main(String[] args) {
        int[] arr ={2,4,5,9,76,43,56};

        // swap two elements
        swapIndex(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

    }
}
