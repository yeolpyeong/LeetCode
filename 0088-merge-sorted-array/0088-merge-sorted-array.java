class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        while (m>=0 && n>=0 && m+n>=0) {
            if (nums1[m]>nums2[n]) {
                nums1[m+n+1] = nums1[m];
                m--;
            } else {
                nums1[m+n+1] = nums2[n];
                n--;
            }
        }
        
        for (int i=m; i>=0; i--) {
            nums1[i] = nums1[i];
        }
        for (int i=n; i>=0; i--) {
            nums1[i] = nums2[i];
        }
    }
}