class Solution {
    public double solution(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for (int i=0; i<len; i++) {
            sum += arr[i];
        }
        double answer = (double) sum / len;
        return answer;
    }
}
