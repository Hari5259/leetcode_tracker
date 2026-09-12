// Last updated: 9/12/2026, 9:25:39 AM
1public class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String doubled = s + s;
4        String sub = doubled.substring(1, doubled.length() - 1);
5        return sub.contains(s);
6    }
7}