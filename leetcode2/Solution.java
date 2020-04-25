package leetcode2;

import java.util.*;

public class Solution {
    public static char[] reverseString(char[] s) {
        for (int i=0;i<s.length/2;i++) {
            char tmp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = tmp;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replace("[\"","");
        input = input.replace("\"]","");
        input = input.replace("\",\"", "");
        char[] s = input.toCharArray();
        s = reverseString(s);
        String tmp = "[\"";
        for (int i=0;i<s.length; i++) {
            if (i != s.length-1) {
                tmp+=s[i];
                tmp += "\",\"";
            }
            else {
                tmp+=s[i];
                tmp+="\"]"; 
            }
        }
        System.out.println(tmp);
    }
}