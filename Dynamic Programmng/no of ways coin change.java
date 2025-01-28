memoization
  class Solution {
    public int change(int sum, int[] coins) {
        int[][] dp=new int[coins.length][sum+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return f(sum,coins,coins.length-1,dp);
    }
    public int f(int sum,int[] coins,int n,int[][] dp){
        if(sum==0){
           return 1;
        }
        if(n<0 || sum<0){
            return 0;
        }
        if(dp[n][sum]!=-1) return dp[n][sum];
         int notTake=f(sum,coins,n-1,dp);
         
        //  if(coins[n]<sum){
           int  take= f(sum-coins[n],coins,n,dp);
         
         return dp[n][sum]=take+notTake;
    }
}
