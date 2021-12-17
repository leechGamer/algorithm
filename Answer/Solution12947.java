class Solution {
    public boolean solution(int x) {
        String[] splitted = String.valueOf(x).split("");
        int divider = 0;
        
        for (int i =0; i<splitted.length; i++) {
            divider += Integer.parseInt(splitted[i]);
        }
        
        if (x % divider == 0) {
            return true;
        }
        return false;
    }
}
