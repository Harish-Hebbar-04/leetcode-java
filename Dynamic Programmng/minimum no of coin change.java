memoization
  class Solution {
    public int coinChange(int[] coins, int amount) {
        // Call the recursive function with the last coin
        
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int result = helper(coins, amount, coins.length - 1,dp);
        // If no solution exists, return -1
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int helper(int[] coins, int amount, int i,int[][] dp) {
        // Base case: if amount becomes 0, no coins are needed
        if (amount == 0) return 0;

        // Base case: if no coins are left or amount becomes negative, return "infinity"
        if (i < 0 || amount < 0) return Integer.MAX_VALUE;
        if(dp[i][amount]!=-1) return dp[i][amount];

        // Do not take the current coin
        int notTake = helper(coins, amount, i - 1, dp);

        // Take the current coin (if possible)
        int take = Integer.MAX_VALUE;
        if (coins[i] <= amount) {
            int subResult = helper(coins, amount - coins[i], i, dp);
            if (subResult != Integer.MAX_VALUE) {
                take = 1 + subResult; // Add 1 to include the current coin
            }
        }

        // Return the minimum of the two options
        return dp[i][amount]= Math.min(take, notTake);
    }
}
