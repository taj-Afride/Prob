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
    public void Postorder(TreeNode root,ArrayList<Integer> ls){
        if(root==null){
            return;
        }
        Postorder(root.left,ls);
        Postorder(root.right,ls);
        ls.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ls=new ArrayList<>();
        Postorder(root,ls);
        return ls;
    }
}