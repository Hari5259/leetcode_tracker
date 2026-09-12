// Last updated: 9/12/2026, 2:43:11 PM
1public class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if (n == 0) return false;
4        
5        while (n > 0) {
6            if (n == 1) return true;
7            if (n % 2 != 0) break;
8            n /= 2;
9        }
10        return false;
11    }
12}