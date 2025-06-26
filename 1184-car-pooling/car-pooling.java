class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int stops[]=new int[1001];
        for(int i=0;i<trips.length;i++){
            int numPassanger=trips[i][0];
            stops[trips[i][1]]+=numPassanger;
            stops[trips[i][2]]-=numPassanger;
        }
        int sum=0;
        for(int i=0;i<stops.length;i++){
            sum+=stops[i];
            if(sum>capacity){
                return false;
            }
        }
        return true;
    }
}