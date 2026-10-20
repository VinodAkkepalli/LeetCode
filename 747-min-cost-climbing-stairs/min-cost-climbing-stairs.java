class Solution {

    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(myRec(cost, cost.length-1), myRec(cost, cost.length-2));
    }

    public int myRec(int[] cost, int i) {
        if(i==0 || i==1) return dp[i] = cost[i];
        if(dp[i] != -1) return dp[i];

        return dp[i] = cost[i] + Math.min(myRec(cost, i-1), myRec(cost, i-2));
    }
}