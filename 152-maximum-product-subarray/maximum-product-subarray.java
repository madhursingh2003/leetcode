class Solution {
    public int maxProduct(int[] nums) {
        int left=1;
        int right=1;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            left*=nums[i];
            right*=nums[nums.length-1-i];
            max=Math.max(max,Math.max(left,right));
            if(left==0)left = 1;
            if(right==0)right = 1;
        }
        return max;
    }
}