class Solution {
    public int helper(int left,int right,int []nums,int target){
        if(left>right){
            return left;
        }
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(target>nums[mid]){
            return helper(mid+1,right,nums,target);
        }
        return helper(left,mid-1,nums,target);
    }
    public int searchInsert(int[] nums, int target) {
        return helper(0,nums.length-1,nums,target);
    }
}