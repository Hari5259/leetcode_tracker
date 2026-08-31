// Last updated: 8/31/2026, 1:56:06 PM
1class Solution {
2    public List<Integer> postorderTraversal(TreeNode root) {
3
4        List<Integer> ans = new ArrayList<>();
5
6        postorder(root, ans);
7
8        return ans;
9    }
10
11    public void postorder(TreeNode root, List<Integer> ans) {
12
13        if (root == null)
14            return;
15
16        postorder(root.left, ans);
17
18        postorder(root.right, ans);
19
20        ans.add(root.val);
21    }
22}