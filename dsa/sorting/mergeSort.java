import java.util.Arrays;

class Sort {
    static void merge(int arr[], int start, int mid, int end) {
        int size1 = mid - start + 1;
        int size2 = end - mid;

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        for(int i =0 ;i <size1; i++){
            arr1[i] = arr[start + i];
       	}
        for(int j=0; j<size2; j++){
            arr2[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < size2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

        for(int l=start;l<end; l++){
            System.out.print(arr[l]+" ");
        }
	System.out.println();
    }

    static void mergesort(int arr[], int start, int end) {
        if(start < end) {
            int mid = (end + start) / 2;
	
            System.out.println("start: "+start);
            System.out.println("mid: "+mid);
            System.out.println("end: "+end);
    
            mergesort(arr, start, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, start, mid, end);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 7, 4, 2, 6, -3 };

        System.out.println(Arrays.toString(arr));
   
        mergesort(arr, 0, 7);

        System.out.println(Arrays.toString(arr));
    }
}
