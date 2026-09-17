class Solution {
    int[] dp;
    public int mine(int n,int i,int[] cost){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        dp[i]=cost[i]+Math.min(mine(n,i+1,cost),mine(n,i+2,cost));
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }

        return Math.min(mine(n,0,cost),mine(n,1,cost));
    }
}
