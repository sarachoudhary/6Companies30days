class Solution {
    public int minMoves2(int[] nums) {
        int mid1, mid2;
        Arrays.sort(nums);
        if(nums.length % 2 != 0){
            mid1 = mid2 = nums[nums.length / 2];
        } else {
            mid1 = nums[nums.length / 2];
            mid2 = nums[(nums.length / 2) - 1];
        }
        int tot1 = 0;
        int tot2 = 0;
        for(int i = 0; i < nums.length; i++){
           tot1 += Math.abs(nums[i] - mid1);
           tot2 += Math.abs(nums[i] - mid2);  
        }
        return Math.min(tot1, tot2);
    }
}
