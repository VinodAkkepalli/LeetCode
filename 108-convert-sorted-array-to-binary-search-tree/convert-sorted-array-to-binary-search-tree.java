/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return buildBST(nums, 0, nums.length-1);
    }

    TreeNode buildBST(int[] nums, int li, int ri) {
        
        if(li > ri) return null;

        int mid = (li+ri)/2;
        
        return new TreeNode(nums[mid],
            buildBST(nums, li, mid-1),
            buildBST(nums, mid+1, ri) );
    }
}