// Last updated: 7/14/2026, 11:10:37 AM
1class Solution {
2
3    public List<TreeNode> generateTrees(int n) {
4
5        if (n == 0)
6            return new ArrayList<>();
7
8        return build(1, n);
9    }
10
11    private List<TreeNode> build(int start, int end) {
12
13        List<TreeNode> result = new ArrayList<>();
14
15        // Base case
16        if (start > end) {
17            result.add(null);
18            return result;
19        }
20
21        // Try every number as root
22        for (int root = start; root <= end; root++) {
23
24            List<TreeNode> leftTrees = build(start, root - 1);
25            List<TreeNode> rightTrees = build(root + 1, end);
26
27            // Combine every left with every right
28            for (TreeNode left : leftTrees) {
29                for (TreeNode right : rightTrees) {
30
31                    TreeNode node = new TreeNode(root);
32                    node.left = left;
33                    node.right = right;
34
35                    result.add(node);
36                }
37            }
38        }
39
40        return result;
41    }
42}