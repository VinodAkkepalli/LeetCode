class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;
        int j = 1;

        // if(nums.length == 1) return 1;

        while(j < nums.length) {
            if(j < nums.length && nums[i] == nums[j]) {
              j++;
            } else if(j < nums.length) {
                nums[i+1] = nums[j];
                i++;
            }
            
        }
        return i+1;
    }
}