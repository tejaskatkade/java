public class SumSubarray {
    static int[] subArraySum(int arr[], int s, int n) {
        int flag = 1;
        // {1,2,3,7,5}
        int array[] = new int[2];
        int j = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            
            if (sum > s) {
                sum = sum - arr[j];
                System.out.println(sum);
                j++;
                System.out.println(j);
            }
            if (sum == s) {

                array[0] = j + 1;
                array[1] = i ;
                System.out.println("here2");
                flag = 0;
                return array;

            }
            sum = sum + arr[i];
            System.out.println("main sum ="+sum);
            //System.out.println("here1");
            

        }
        if (flag == 1) {
            array[0] = -1;
            // array[1] = -1;
        }

        return array;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1 };
        int s = 0;

        int array[] = subArraySum(arr, s, 5);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
