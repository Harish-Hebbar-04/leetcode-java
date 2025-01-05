class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n; // Base cases

        int prev2 = 1; // Ways to reach step 0
        int prev1 = 2; // Ways to reach step 1

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2; // Ways to reach current step
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
