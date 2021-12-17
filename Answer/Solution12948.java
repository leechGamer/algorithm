class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length() - 4;
        String answer = "";
        String subString = phone_number.substring(len);
        
        for (int i=0;i<len;i++) {
            answer += "*";
        }
        
        answer += subString;
        
        return answer;
    }
}
