package array;

public class Main {

     public static void main(String[] args) {
        int[] arr; // defining the array 
                   // arr is getting defined in the stack
                   
        arr = new int[5]; // initialization
                          // Actually here the object is created in the memory (Heap) at runtime i.e. dynamic memory allocation
        

        int[] arr1 = new int[3];  // stores 3 integers

        System.out.println(arr1[0]);  // 0
        System.out.println(arr1[1]);  // 0
        
        int[] arr2 = {3,4,5,6,7}; // 

        System.out.println(arr2[0]);  // 3
        System.out.println(arr2[1]);  // 4
        System.out.println(arr2[4]);  // 7

        // String array

        String[] arr3 = new String[5];  

        System.out.println(arr3);     // null
        System.out.println(arr3[0]);  // null
        System.out.println(arr3[1]);  // null
        System.out.println(arr3[2]);  // null
        System.out.println(arr3[3]);  // null
        System.out.println(arr3[4]);  // null
    
     }
}