class Solution {
    public int fun(int n,int newNo){
        if(n<=0) return newNo;
        int rem=n%10;
        newNo=newNo*10+rem;
        n/=10;
        return fun(n,newNo);
    }
    public boolean isPalindrome(int x) {
       if(x==fun(x,0)) return true;
       return false;
    }
}