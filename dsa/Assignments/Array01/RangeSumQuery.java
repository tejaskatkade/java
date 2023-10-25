// Problem Description
// - You are given an integer array A of length N.
// - You are also given a 2D integer array B with dimensions M x 2,
// - where each row denotes a [L, R] query.
// - For each query, you have to find the sum of all elements from L to R
// indices in A (0 - indexed).
// - More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.


package assignments;

import java.util.Scanner;

public class RangeSumQuery {
    static int[] findSum(int[] arr, int[][] array ){
        int[] ans = new int[array.length];

        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
        // Prefix array;
        int[] parr = new int[arr.length];
        parr[0] = arr[0];
        for (int i=1;i<arr.length;i++){
            parr[i]=arr[i]+parr[i-1];
        }
        for (int i : parr) {
            System.out.print(i);
        }
        System.out.println();

        for(int i=0; i<array.length; i++){
            int s = array[i][0];
            int e = array[i][1];

            if(s == 0){
                ans[i]=parr[e];
            }else{
                ans[i]=parr[e]-parr[s-1];
            }
        }


        return ans;
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

        System.out.println("Enter No of rows for 2D array");
        int M = sc.nextInt();
        int[][] array = new int[M][2];
        System.out.println("Enter array elements");
        for(int i=0; i<array.length; i++){
            for(int j=0;j<array[i].length; j++){
                array[i][j] = sc.nextInt();
            }
        }

        int[] ans = findSum(arr,array);

        for (int i : ans) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
