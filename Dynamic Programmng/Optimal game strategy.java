//  https://www.geeksforgeeks.org/problems/optimal-strategy-for-a-game-1587115620/1
// IMPORTANT PROBLEM 
class solve {
    // Function to find the maximum possible amount of money we can win.
    static int maximumAmount(int arr[]) {
        int[][] dp=new int[arr.length][arr.length];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return f(arr,0,arr.length-1,dp);
    }
    static int f(int[] arr,int i,int j,int[][]dp){
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int left=arr[i]+Math.min(f(arr,i+2,j,dp),f(arr,i+1,j-1,dp));
        int right=arr[j]+Math.min(f(arr,i,j-2,dp),f(arr,i+1,j-1,dp));
        return dp[i][j]=Math.max(left,right);
    }
}
