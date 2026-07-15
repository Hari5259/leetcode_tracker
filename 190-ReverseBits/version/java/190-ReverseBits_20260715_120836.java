// Last updated: 7/15/2026, 12:08:36 PM
1class Solution {
2    public int reverseBits(int n) {
3
4        int ans = 0;
5
6        for (int i = 0; i < 32; i++) {
7
8            ans <<= 1;          // Make space for next bit
9            ans |= (n & 1);     // Copy last bit of n
10            n >>>= 1;           // Move to next bit
11        }
12
13        return ans;
14    }
15}