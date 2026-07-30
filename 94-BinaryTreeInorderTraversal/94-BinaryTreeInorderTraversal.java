// Last updated: 7/30/2026, 9:28:17 AM
class Solution {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        inorder(root);

        return ans;
    }

    private void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        ans.add(root.val);

        inorder(root.right);
    }
}