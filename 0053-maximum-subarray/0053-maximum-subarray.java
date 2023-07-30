class Solution {
    public int maxSubArray(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i]+nums[i-1]);            
        }     

        int max = nums[0];
        for (int num:nums) {
            max = num>max?num:max;
        }        
        return max;
    }
}