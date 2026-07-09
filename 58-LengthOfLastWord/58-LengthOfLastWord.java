// Last updated: 7/9/2026, 11:36:38 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        
        return arr[arr.length-1].length();
    }
}