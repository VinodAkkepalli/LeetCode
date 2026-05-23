class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = -1;

        int l = nums.length;

        int lIndex = 0;
        int rIndex = l-1;
        int mid;

        while(lIndex <= rIndex) {
            mid = lIndex + (rIndex - lIndex) / 2;
            
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                rIndex = mid - 1;
            } else if (nums[mid] < target) {
                lIndex = mid + 1;
            }
        }
        
        return lIndex;
    }
}