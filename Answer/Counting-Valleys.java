import java.io.*;
import java.util.Scanner;

public class CountringValleys{
    public static int countValley(String str) {
        int count = 0;
        int v = 0;
        char arr[] = str.toCharArray();
        
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]=='D') {
                count ++;
                
            } else {
                count--;
            }
            
            if(count == 0 && arr[i]=='U') {
                v++;
                
            }
            
        }
        
        return v;
    }
    
    
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int length = s.nextInt();
        String  str = s.next();
        
        int result = countValley(str);
        System.out.println(result);
        
        s.close();

            
        

}

}
