class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        int []prefixsum=new int[nums.length];
        prefixsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<prefixsum.length;j++){
            if(prefixsum[j]==k){
                ans+=1;
            }
            if(map.containsKey(prefixsum[j]-k)){
                ans+=map.get(prefixsum[j]-k);
            }
            map.put(prefixsum[j],map.getOrDefault(prefixsum[j],0)+1);
        }
        return ans;
    }
}