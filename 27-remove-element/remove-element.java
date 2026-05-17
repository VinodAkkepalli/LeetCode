class Solution {
    public int removeElement(int[] nums, int val) {
        
        int numsLen = nums.length;
        if(numsLen == 0) return 0;
        if(numsLen == 1) {
            if(nums[0] == val) return 0;
            return 1;
        }

        int i = numsLen-1;
        int temp;

        int j = 0;
        while(j <= i) {
            if(nums[j] != val) {
                j++;
            } else if(nums[i] == val) {
                i--;
            } else {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; i--;
            }

        }
        return i+1;
    }
}