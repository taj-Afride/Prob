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
        if(ls==-1) return -1;
        int rs=height(root.right); 
        if(rs==-1) return -1;
        if(Math.abs(ls-rs)>1) return -1;
        return 1+Math.max(ls,rs);
    }
    public boolean isBalanced(TreeNode root) {
       return height(root)!=-1;   
    }
}