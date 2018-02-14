import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.*;
public class Solution {

    static long theGreatXor(long x){
            long result=0;
            long squareNumber = (long) (Math.log(x)/Math.log(2));
            long squaredValue = (long) Math.pow(2,squareNumber);
            long minusValue = x-squaredValue+1;
            
            result = squaredValue-minusValue;
            return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            long result = theGreatXor(x);
            System.out.println(result);
        }
    }
}
