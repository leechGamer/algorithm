import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatsandMouse {

   static String catAndMouse(int x, int y, int z) {
         int[] num = new int[2];
         String result = "";
         num = makeAbsoluteValue(x,y,z);
         result = compareNumbers(num);
         return result;
        }
     
     public static String compareNumbers(int[] num) {
         if(num[0] < num[1]) {
             return "Cat A";
         } else if(num[1] < num[0]) {
             return "Cat B";
             
         } else {
             return "Mouse C";
         }
     }
     public static int[] makeAbsoluteValue(int catA, int catB, int mouse) {
         int num[] = new int[2];
         num[0] = mouse-catA;
         num[1] = mouse-catB;
         for(int i=0;i<2;i++) {
             if(num[i] < 0) {
                 num[i] = (-1) * num[i];
             }
         }
         
         return num;
     }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int x = 0;
        int y = 0;
        int z = 0;
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
           x = scanner.nextInt();
           y = scanner.nextInt();
           z = scanner.nextInt();
         
           String result = catAndMouse(x, y, z);
           System.out.println(result);
           
        }
        scanner.close();

            
        

}

}

