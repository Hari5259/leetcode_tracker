// Last updated: 7/15/2026, 9:03:09 AM
1class Solution {
2    public int numSquares(int n) {
3
4        int[] dp = new int[n + 1];
5
6        Arrays.fill(dp, Integer.MAX_VALUE);
7
8        dp[0] = 0;
9
10        for (int i = 1; i <= n; i++) {
11
12            for (int j = 1; j * j <= i; j++) {
13
14                int square = j * j;
15
16                dp[i] = Math.min(dp[i], dp[i - square] + 1);
17            }
18        }
19
20        return dp[n];
21    }
22}
23