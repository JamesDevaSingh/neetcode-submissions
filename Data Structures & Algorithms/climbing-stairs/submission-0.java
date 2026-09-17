class Solution {
    int[] dp;
    public int stair(int n,int i){
        if(i>=n)return i==n?1:0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=stair(n,i+1)+stair(n,i+2);
    }
    public int climbStairs(int n) {
        dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        stair(n,0);
        return dp[0];
    }
}
