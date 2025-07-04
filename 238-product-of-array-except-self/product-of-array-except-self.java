class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans=new int[nums.length];
        int prefix=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=prefix;
            prefix*=nums[i];
        }
        int suffix=1;
        for(int j=nums.length-1;j>=0;j--){
            ans[j]*=suffix;
            suffix*=nums[j];
        }
        return ans;
    }
}