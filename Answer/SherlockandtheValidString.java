import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isValid(String s){
            int[] countArray = new int[26];
            int pivot = 0;
            int count = 0;
            String result = "YES";
            Arrays.fill(countArray, 0);
            for(int i=0; i<s.length();i++) {
                int tmp = (int) s.charAt(i);
                countArray[tmp-97] += 1;
            }
            for(int i=0; i<s.length();i++) {
                if(countArray[i] != 0 && countArray[i] != 1) {
                    pivot = countArray[i];
                    break;
                }
            }
            for(int i=0; i<countArray.length;i++) {
                if(countArray[i] != 0 && countArray[i] >= pivot) {
                    countArray[i]= countArray[i]-pivot;
                }
                
            }
            for(int i=0; i<countArray.length;i++) {
                if(countArray[i] != 0) {
                    count+=countArray[i];
                }
            }
            if(count>1) {
                result = "NO";
            } 
            return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
