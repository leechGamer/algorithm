class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while (i < j) {
            char tmp = s[i];
            char tmpJ = s[j];
            s[i] = tmpJ;
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
