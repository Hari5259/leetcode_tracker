// Last updated: 9/11/2026, 2:24:21 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n = digits.length;
4
5        for (int i = n - 1; i >= 0; i--) {
6            digits[i]++;
7
8            if (digits[i] == 10) {
9                digits[i] = 0;
10            } else {
11                return digits;
12            }
13        }
14
15        int[] newDigits = new int[n + 1];
16
17        newDigits[0] = 1;
18
19        return newDigits;
20    }
21}