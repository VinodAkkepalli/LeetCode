class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans=1;
        int maxLen =1;

        if(nums.length == 1) {
            return 1;
        }

        for(int i=1; i< nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                ans++;
            } else if(nums[i] <= nums[i-1]) {
                ans = 1;
            }
            maxLen = Math.max(maxLen, ans);
        }
        return maxLen;
    }
}