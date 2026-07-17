// Last updated: 7/17/2026, 12:24:44 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16
17class Solution {
18    public boolean isSameTree(TreeNode p, TreeNode q) {
19
20        if (p == null && q == null)
21            return true;
22
23        if (p == null || q == null)
24            return false;
25
26        if (p.val != q.val)
27            return false;
28
29        return isSameTree(p.left, q.left)
30                && isSameTree(p.right, q.right);
31    }
32}