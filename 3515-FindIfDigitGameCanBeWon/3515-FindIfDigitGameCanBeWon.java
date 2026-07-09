// Last updated: 7/9/2026, 11:35:56 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int alice=0,bob=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9)
            alice+=nums[i];
            else
            bob+=nums[i];
            
        }
        if((alice>bob)||(alice<bob))
        return true;
        else
        return false;


    }
}