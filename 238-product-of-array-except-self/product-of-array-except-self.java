class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];

        
        
        /**
            Calculating prefix elemets product below
         */
        int prod = 1;
        res[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            prod *= nums[i-1];
            res[i] = prod;
        }


        /**
            Calculating suffix elements product
            multiplying with prefix product to get answer for each index
         */
        prod = 1;
        for(int i = nums.length-2; i > -1; i--) {
            prod *= nums[i+1];
            res[i] = res[i] * prod;
        }

        return res;
    }
}