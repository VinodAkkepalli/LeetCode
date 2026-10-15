class Solution {
    public int rob(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        // return myRec1(nums, nums.length-1, ans);

        //Iterative approach
        ans[0] = nums[0];

        if(nums.length == 1) {
            return ans[0];
        }

        ans[1] = Math.max(nums[0], nums[1]);

        if(nums.length == 2) {
            return ans[1];
        }

        for(int i=2; i<nums.length; i++) {
            ans[i] = Math.max(ans[i-2]+nums[i], ans[i-1]);
        }

        return ans[nums.length-1];
    }

    public int myRec(int[] nums, int n) {
        if (n == 0){
            return nums[n];
        }
        if(n == 1) {
            return Math.max(nums[n], nums[n-1]);
        }

        return Math.max(myRec(nums, n-2)+nums[n], myRec(nums, n-1));
    }


    public int myRec1(int[] nums, int n, int[] ans) {
        if (n == 0){
            ans[n] = nums[n];
            return ans[n];
        }
        if(n == 1) {
            ans[n] = Math.max(nums[n], nums[n-1]);
            return ans[n];
        }

        if(ans[n] != -1) {
            return ans[n];
        }
        ans[n] = Math.max(myRec(nums, n-2)+nums[n], myRec(nums, n-1));

        return ans[n];
    }
}