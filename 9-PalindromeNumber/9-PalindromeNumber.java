// Last updated: 7/9/2026, 11:36:57 AM
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        if(x<0)
        return false;
        while(x!=0)
        {
            int rev=x%10;
            sum=sum*10+rev;
            x=x/10;

        }
        
        if(sum==temp){
        return true;}
        else{
        return false;}
    }
}