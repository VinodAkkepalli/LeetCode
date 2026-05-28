class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int val = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if( nums[i] == val ) {
                count++;
            } else if( nums[i] != val ) {
                if(count == 0) {
                    val = nums[i];
                } else {
                    count--;
                }
            }
        }
        return val;
    }
}