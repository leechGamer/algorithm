class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m-1;
        int n2 = n-1;
        while(n1 >= 0 && n2 >= 0) {
            if (nums1[n1] > nums2[n2]) {
                nums1[n1+n2+1] = nums1[n1];
                n1--;
            } else {
                nums1[n1+n2+1] = nums2[n2];
                n2--;
            }
        }
        
         while (n2 >= 0) {
            nums1[n1+n2+1]=nums2[n2--];
        }
    }
}
// Runtime: 0 ms, faster than 100.00% of Java 
