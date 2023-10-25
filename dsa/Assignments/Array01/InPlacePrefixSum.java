package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InPlacePrefixSum {

    static void inPlacePrefixSum(int[] arr) {
        // Prefix array;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args)throws IOException{
        System.out.println("Enter array size");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();
        inPlacePrefixSum(arr);

    }
}
