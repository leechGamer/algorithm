class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        for (int i=0;i<n/2+1;i++) {
            char tmp = s[i];
            s[i] = s[n-i];
            s[n-i] = tmp;
        }
    }
}
