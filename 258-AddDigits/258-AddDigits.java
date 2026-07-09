// Last updated: 7/9/2026, 11:36:10 AM
class Solution {
    public int addDigits(int num) {
        if(num<=9)
        return num;
       
        while(num>9)
        {
        int temp=0;
        while(num!=0){
           int dig=num%10;
           temp=temp+dig;
           num=num/10;
        }
        num=temp;
        }
        return num;
    }
}