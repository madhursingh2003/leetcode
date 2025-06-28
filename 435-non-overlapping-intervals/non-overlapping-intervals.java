class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int ans=0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
         int prev=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=prev){
                prev=intervals[i][1];
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}