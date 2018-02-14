import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
            int appleCount=0;
            int orangeCount=0;
            int result[] = new int[2];
            for(int i=0;i<apple.length;i++) {
                int bound = apple[i]+a;
                if(bound>=s&&bound<=t) {
                    appleCount+=1;
                } 
            }
            result[0] = appleCount;
            for(int j=0;j<orange.length;j++) {
                int bound = orange[j]+b;
                if(bound>=s&&bound<=t) {
                    orangeCount+=1;
                } 
            }
            result[1] = orangeCount;
        
            return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int[] result = appleAndOrange(s, t, a, b, apple, orange);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
