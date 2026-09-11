// Last updated: 9/11/2026, 2:21:58 PM
1class Solution {
2    public int mySqrt(int x) {
3        if (x == 0) {
4            return 0;
5        }
6        int first = 1, last = x;
7        while (first <= last) {
8            int mid = first + (last - first) / 2;
9            if (mid == x / mid) {
10                return mid;
11            } else if (mid > x / mid) {
12                last = mid - 1;
13            } else {
14                first = mid + 1;
15            }
16        }
17        return last;
18    }
19}