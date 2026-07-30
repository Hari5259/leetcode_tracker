// Last updated: 7/30/2026, 9:28:15 AM
class Solution {

    public List<TreeNode> generateTrees(int n) {

        if (n == 0)
            return new ArrayList<>();

        return build(1, n);
    }

    private List<TreeNode> build(int start, int end) {

        List<TreeNode> result = new ArrayList<>();

        // Base case
        if (start > end) {
            result.add(null);
            return result;
        }

        // Try every number as root
        for (int root = start; root <= end; root++) {

            List<TreeNode> leftTrees = build(start, root - 1);
            List<TreeNode> rightTrees = build(root + 1, end);

            // Combine every left with every right
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {

                    TreeNode node = new TreeNode(root);
                    node.left = left;
                    node.right = right;

                    result.add(node);
                }
            }
        }

        return result;
    }
}