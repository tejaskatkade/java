//1. two sum

class ArrayDemo {
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
    
	    int nums[] = {2,3,5,9};
	    int ans[] = new int[2];
	    ans = twoSum(nums,7);

	    for(int i=0; i<2; i++){
	    	System.out.println(ans[i]);
	    }
    }
}
