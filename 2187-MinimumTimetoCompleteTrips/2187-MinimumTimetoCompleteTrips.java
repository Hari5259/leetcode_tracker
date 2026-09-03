// Last updated: 9/3/2026, 11:38:48 AM
1class Solution {
2    public long minimumTime(int[] time, int totalTrips) {
3
4        long left = 1;
5
6        long minTime = time[0];
7
8        for (int i = 1; i < time.length; i++) {
9            minTime = Math.min(minTime, time[i]);
10        }
11
12        long right = minTime * totalTrips;
13
14        while (left < right) {
15
16            long mid = left + (right - left) / 2;
17
18            long trips = 0;
19
20            for (int i = 0; i < time.length; i++) {
21                trips += mid / time[i];
22
23                if (trips >= totalTrips) {
24                    break;
25                }
26            }
27
28            if (trips >= totalTrips) {
29                right = mid;
30            } else {
31                left = mid + 1;
32            }
33        }
34
35        return left;
36    }
37}