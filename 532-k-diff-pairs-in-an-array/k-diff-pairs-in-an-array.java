class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(int num : freq.keySet()){
            if(k==0){
                if(freq.get(num)>=2){
                    ans++;
                }
            }else{
                    if(freq.containsKey(num+k)){
                        ans++;
                    }
                }
        }
        return ans;
    }
}