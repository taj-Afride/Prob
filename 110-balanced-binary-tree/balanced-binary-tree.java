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
    public static int height(TreeNode root){
        if(root==null){
           return 0;
        }
        int ls=height(root.left);
        int rs=height(root.right); 
        return 1+Math.max(ls,rs);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left=height(root.left);
        int right=height(root.right);
        if (Math.abs(left-right)>1) return false;
        boolean le=isBalanced(root.left);
        boolean r=isBalanced(root.right);
        if(!le || !r) return false;
        return true; 

         
    }
}