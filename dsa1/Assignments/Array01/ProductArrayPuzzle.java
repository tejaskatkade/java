// Problem Description
// - Given an array of integers A, find and return the product array of the same
// size where the ith element of the product array will be equal to the

// product of all the elements divided by the ith element of the array.

// - Note: It is always possible to form the product array with integer (32 bit)
// values. Solve it without using the division operator.

package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductArrayPuzzle {

    static int[] puzzle(int[] arr) {
        int[] productArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    product = product * arr[j];
                }
            }
            productArr[i] = product;
        }
        return productArr;
    }

    public static void main(String[] args) throws IOException {
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
        int[] productArr = puzzle(arr);

        for (int i = 0; i < productArr.length; i++) {
            System.out.print(productArr[i]+" ");
        }
        System.out.println();
    }
}
