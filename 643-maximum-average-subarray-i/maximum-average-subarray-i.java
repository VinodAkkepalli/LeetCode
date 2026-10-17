class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        int left = 0;
        double ans = -Double.MAX_VALUE;

        for(int i=0; i< nums.length; i++) {
            sum += nums[i];
            while(i-left+1 == k){
                ans = Math.max(ans, sum/k);
                sum -= nums[left];
                left++;
            }
        }

        return ans;
        
    }
}