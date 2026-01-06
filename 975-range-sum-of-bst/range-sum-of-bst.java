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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int count = 0;

        count += root.val <= high && root.val >= low ? root.val : 0;

        if(root.left != null){
            count += rangeSumBST(root.left, low, high);
        }

        if(root.right != null){
            count += rangeSumBST(root.right, low, high);
        }

        return count;
    }
}