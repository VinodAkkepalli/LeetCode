class Solution {
    public int searchInsert(int[] nums, int target) {

        int lIndex = 0;
        int rIndex = nums.length - 1;

        while(lIndex <= rIndex) {
            int mid = lIndex + (rIndex - lIndex) / 2;
            
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