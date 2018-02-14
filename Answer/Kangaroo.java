import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int position1 = x1+v1;
        int position2 = x2+v2;
    String result = "NO";
    if(x1>x2 && v1>v2) {
            return result;
    }
    for(int i=0;i<10000;i++) {
            if(position1==position2) {
                result = "YES";
                break;
            } 
            position1 += v1;
            position2 += v2;
    }
    return result;
  }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
