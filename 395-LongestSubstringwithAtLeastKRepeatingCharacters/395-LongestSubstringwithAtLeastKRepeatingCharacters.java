// Last updated: 9/2/2026, 9:49:31 AM
1class Solution {
2
3    public int longestSubstring(String s, int k) {
4
5        if (s.length() < k) {
6            return 0;
7        }
8
9        int[] freq = new int[26];
10
11        // Count frequency of each character
12        for (int i = 0; i < s.length(); i++) {
13            char ch = s.charAt(i);
14            freq[ch - 'a']++;
15        }
16
17        // Find a character whose frequency is less than k
18        for (int i = 0; i < s.length(); i++) {
19
20            char ch = s.charAt(i);
21
22            if (freq[ch - 'a'] < k) {
23
24                int left = longestSubstring(
25                    s.substring(0, i), k
26                );
27
28                int right = longestSubstring(
29                    s.substring(i + 1), k
30                );
31
32                return Math.max(left, right);
33            }
34        }
35
36        // Every character appears at least k times
37        return s.length();
38    }
39}