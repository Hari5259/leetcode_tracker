// Last updated: 9/3/2026, 11:42:49 AM
1class Solution {
2
3    int ans = Integer.MAX_VALUE;
4
5    public int distributeCookies(int[] cookies, int k) {
6
7        int[] children = new int[k];
8
9        backtrack(cookies, 0, children);
10
11        return ans;
12    }
13
14    void backtrack(int[] cookies, int index, int[] children) {
15
16        // All bags distributed
17        if (index == cookies.length) {
18
19            int unfairness = 0;
20
21            for (int i = 0; i < children.length; i++) {
22                unfairness = Math.max(unfairness, children[i]);
23            }
24
25            ans = Math.min(ans, unfairness);
26
27            return;
28        }
29
30        // Give current bag to every child
31        for (int i = 0; i < children.length; i++) {
32
33            children[i] += cookies[index];
34
35            backtrack(cookies, index + 1, children);
36
37            children[i] -= cookies[index];
38        }
39    }
40}