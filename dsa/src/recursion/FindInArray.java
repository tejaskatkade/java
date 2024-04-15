package recursion;

public class FindInArray {
    public static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(target == arr[index]){
            return index;
        }else{
            return findIndex(arr,target,index+1);
        }
        
    }

    public static void main(String[] args) {
        
        int[] arr ={1,3,5,6,12,15};
        System.out.println((findIndex(arr,15,0)));
    }
}
