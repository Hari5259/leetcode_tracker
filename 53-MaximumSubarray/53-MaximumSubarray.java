// Last updated: 8/8/2026, 9:13:49 AM
1class Solution {
2    public int maxSubArray(int[] arr) {
3        int sum=0;
4        int max=Integer.MIN_VALUE;
5        for(int i=0;i<arr.length;i++){
6           sum=sum+arr[i];
7           if(sum>max){
8            max=sum;
9           }
10           if(sum<=0){
11            sum=0;
12           }
13        }
14        return max;
15    }
16}