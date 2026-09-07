// Last updated: 9/7/2026, 11:50:18 AM
1class Solution {
2    public int rotatedDigits(int n) {
3
4        int count = 0;
5
6        for (int i = 1; i <= n; i++) {
7
8            int num = i;
9            boolean valid = true;
10            boolean changed = false;
11
12            while (num > 0) {
13
14                int digit = num % 10;
15
16                if (digit == 3 || digit == 4 || digit == 7) {
17                    valid = false;
18                    break;
19                }
20
21                if (digit == 2 || digit == 5 ||
22                    digit == 6 || digit == 9) {
23                    changed = true;
24                }
25
26                num = num / 10;
27            }
28
29            if (valid && changed) {
30                count++;
31            }
32        }
33
34        return count;
35    }
36}