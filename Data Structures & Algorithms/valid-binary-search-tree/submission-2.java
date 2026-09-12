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
    public boolean isValidBST(TreeNode root) {
        boolean leftCheck=isValidBranch(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return leftCheck;
    }
    private boolean isValidBranch(TreeNode root,int leftValue,int rightValue){
        if (root==null){
            return true;
        }
        if (root.val>=rightValue || root.val<=leftValue){
            return false;
        }
        boolean leftCheck=isValidBranch(root.left,leftValue,Math.min(rightValue,root.val));
        boolean rightCheck=isValidBranch(root.right,Math.max(leftValue,root.val),rightValue);
        return leftCheck & rightCheck;
    }
}
