class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;
        int ans = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            
            sum += (gas[i] - cost[i]);

            if(sum < min) {
                min = sum;
                ans = i;
            }
        }

        if(sum < 0) {
            return -1;
        }

        return (ans == n-1) ? 0 : ans + 1;
    }
}