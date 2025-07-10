class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currentsum+=nums[i];
                maxsum=Math.max(maxsum,currentsum);
            }
            else{
                currentsum=nums[i];
            }
        }
        return maxsum;
    }
}