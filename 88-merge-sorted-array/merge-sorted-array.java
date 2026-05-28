class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m==0){
            for(int i=0; i<n ;i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n==0) return;

        int n1Index = nums1.length - 1;
        m--;
        n--;
        while(m>=0 && n>=0) {

            if( nums2[n] >= nums1[m]) {
                nums1[n1Index] = nums2[n];
                n--;
                n1Index--;
            } else {
                nums1[n1Index] = nums1[m];
                m--;
                n1Index--;
            }

        }

        if (m == -1){
            for(int i=n; i>-1 ;i--) {
                nums1[n1Index] = nums2[i];
                n1Index--;
            }
            return;
        }
        
    }
}