// Last updated: 7/14/2026, 11:11:54 AM
1class Solution {
2    public Node connect(Node root) {
3
4        if (root == null)
5            return null;
6
7        Queue<Node> q = new LinkedList<>();
8        q.offer(root);
9
10        while (!q.isEmpty()) {
11
12            int size = q.size();
13
14            Node prev = null;
15
16            for (int i = 0; i < size; i++) {
17
18                Node curr = q.poll();
19
20                if (prev != null)
21                    prev.next = curr;
22
23                prev = curr;
24
25                if (curr.left != null)
26                    q.offer(curr.left);
27
28                if (curr.right != null)
29                    q.offer(curr.right);
30            }
31        }
32
33        return root;
34    }
35}