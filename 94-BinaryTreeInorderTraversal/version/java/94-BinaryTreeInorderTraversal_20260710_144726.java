// Last updated: 7/10/2026, 2:47:26 PM
1class Solution {
2
3    List<Integer> ans = new ArrayList<>();
4
5    public List<Integer> inorderTraversal(TreeNode root) {
6
7        inorder(root);
8
9        return ans;
10    }
11
12    private void inorder(TreeNode root) {
13
14        if (root == null)
15            return;
16
17        inorder(root.left);
18
19        ans.add(root.val);
20
21        inorder(root.right);
22    }
23}