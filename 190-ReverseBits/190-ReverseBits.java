// Last updated: 7/30/2026, 9:28:04 AM
class Solution {
    public int reverseBits(int n) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {

            ans <<= 1;          // Make space for next bit
            ans |= (n & 1);     // Copy last bit of n
            n >>>= 1;           // Move to next bit
        }

        return ans;
    }
}