class Solution {
      public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int spaceIndex = -1;
        int len = c.length;
        for (int i=0;i<c.length+1;i++) {
            if (i == len || s.charAt(i) == ' ') {
                int first = spaceIndex + 1;
                spaceIndex = i;
                int last = spaceIndex -1;
                while (first < last) {
                    char tmp = c[last];
                    c[last] = c[first];
                    c[first] = tmp;
                    first++;
                    last--;
                }
            }
        }
        return new String(c);
       
    }
}
