// Last updated: 7/9/2026, 11:36:32 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=0;i<n;i++){
        nums1[m+i]=nums2[i];
       }    
       Arrays.sort(nums1);
    }
}