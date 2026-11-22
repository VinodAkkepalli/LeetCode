class Solution {

    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        
        //Recursive Solution
        // return Math.min(myRec(cost, cost.length-1), myRec(cost, cost.length-2));


        //DP Bottom-up solution below
        int[] dpBU = new int[cost.length+1];

        Arrays.fill(dpBU, -1);
        dpBU[0] = 0;
        dpBU[1] = 0;

        for(int i=2; i<cost.length+1; i++){
            dpBU[i] = Math.min(dpBU[i-2]+cost[i-2], dpBU[i-1]+cost[i-1]);
        }

        return dpBU[cost.length];
    }

    public int myRec(int[] cost, int i) {
        if(i==0 || i==1) return dp[i] = cost[i];
        if(dp[i] != -1) return dp[i];

        return dp[i] = cost[i] + Math.min(myRec(cost, i-1), myRec(cost, i-2));
    }

}