// Last updated: 7/9/2026, 11:37:00 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        int[] lastIndex = new int[128];

        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1;
        }

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (lastIndex[ch] >= left) {
                left = lastIndex[ch] + 1;
            }

            lastIndex[ch] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}