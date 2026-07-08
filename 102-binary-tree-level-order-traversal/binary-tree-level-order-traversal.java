class Solution {

    public void LevelOrder(TreeNode root, List<List<Integer>> ans) {

        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        List<Integer> level = new ArrayList<>();

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            if (curr == null) {

                ans.add(level);

                if (q.isEmpty()) break;

                level = new ArrayList<>();
                q.offer(null);

            } else {

                level.add(curr.val);

                if (curr.left != null)
                    q.offer(curr.left);

                if (curr.right != null)
                    q.offer(curr.right);
            }
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        LevelOrder(root, ans);

        return ans;
    }
}