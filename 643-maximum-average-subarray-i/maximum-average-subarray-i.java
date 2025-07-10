class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int maxsum=0;
        // sum of first window of the array
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxsum=sum;
        // sum of remaining windowns and finding maxisum sum window
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}