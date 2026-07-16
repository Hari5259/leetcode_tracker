// Last updated: 7/16/2026, 1:57:40 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        char ans = 0;
4
5        for (char c : s.toCharArray()) {
6            ans ^= c;
7        }
8
9        for (char c : t.toCharArray()) {
10            ans ^= c;
11        }
12
13        return ans;
14    }
15}