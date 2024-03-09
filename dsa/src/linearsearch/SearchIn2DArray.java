package linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static int[] search(int[][] array, int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == target){
                    return new int[]{i,j};
                } 
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] array ={
            {1,3,5,7},
            {13,14,15,18,19},
            {31,38,31},
            {56,87,93,74,2,78,90,25}
        };

        int target = 100;
        int[] ans = search(array, target);
        System.out.println(Arrays.toString(ans));
    }
    
}
