class Solution {
    public void moveZeroes(int[] nums) {

        int k = 0;
        while(k< nums.length && nums[k] != 0) {
            k++;
        }

        int insertIndex = k;

        for(int i = insertIndex+1; i <nums.length; i++ ) {
            if(nums[i] !=0) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }

        for(int i=insertIndex; i<nums.length; i++){
            nums[i] = 0;
        }

        // System.out.println(Arrays.toString(nums));
    }
}