// Last updated: 9/7/2026, 11:51:02 AM
1class Solution {
2    public int maxDistToClosest(int[] seats) {
3        int n = seats.length;
4        int empty = 0;
5        int result = 0;
6        int idx1 = -1, idx2 = -1;
7        
8        for(int i = 0; i < n; ++i){
9            if(seats[i] == 1){
10                empty = 0;
11                if(idx1 == -1) idx1 = i;
12                idx2 = i;
13            } else {
14                empty++;
15                result = Math.max(result, (empty+1)/2);
16            }
17        }
18        result = Math.max(result, Math.max(idx1, n-1-idx2));
19        return result;
20    }
21}