// Last updated: 7/9/2026, 11:35:58 AM
class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26]; 
        
    
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
       
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }
        
        int steps = 0;
        for (int val : freq) {
            if (val > 0) steps += val;
        }
        
        return steps;
    }
}
