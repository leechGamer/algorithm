import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
            int max = 0;
            int count = 0;
            int[] type = {0,0,0,0,0};
            for(int i=0;i<ar.length;i++) {
                if(ar[i]==1) {
                    type[0]+=1;
                } else if(ar[i]==2) {
                    type[1]+=1;
                } else if(ar[i]==3) {
                    type[2]+=1;
                } else if(ar[i]==4) {
                    type[3]+=1;
                } else if(ar[i]==5) {
                    type[4]+=1;
                }
            }
            for(int j=0;j<type.length;j++) {
                if(max<type[j]) {
                    max = type[j];
                } else if(max== type[j]) {
                    continue;
                }
            }
            
            for(int k=0;k<type.length;k++) {
                if(type[k]==max) {
                    count = k+1;
                    break;
                }
            }
            return count;
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
