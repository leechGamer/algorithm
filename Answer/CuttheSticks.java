
import java.io.*;
import java.util.Scanner;


public class Solution {

   
    public static int searchMinNum (int[] arr) 
    {    int minNum = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(minNum == 0 && arr[i] != 0) {
                minNum = arr[i];
            }
            if(minNum != 0 && arr[i] != 0) {
                if(arr[i] < minNum) {
                    minNum = arr[i];
                }
            }
        }
        return minNum;
    }
    
    public static int[] makeNewArray(int arr[]) {
        int newArr[] = new int[arr.length];
        int num = searchMinNum(arr);
        for(int i=0;i<arr.length;i++) {
            int madeNum = arr[i]-num;
            if( madeNum <= 0) {
                newArr[i] = 0;
            }else{ 
                newArr[i] = madeNum;
            }
            
        }
        
        return newArr;
    }
    public static int countValidNumber(int arr[]) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                count += 1;
            }
        }
        return count;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int length = scanner.nextInt();
        int[] arr = new int[length];
        int[]tmpArr = new int[arr.length];
        int[] result = new int[arr.length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
       int i = 0; 
       while(true) {
           int num;
           if(i == 0) {
              tmpArr = arr;
              num = arr.length;
           }else {
              tmpArr = makeNewArray(tmpArr);
              num = countValidNumber(tmpArr);
           }
           if(num == 0) {
               break;
           } 
           result[i] = num;
           i++;
       }
       for(int j = 0; j < result.length; j++) {
           if(result[j] != 0) {
               System.out.println(result[j]);
           }
       }
        
        
        scanner.close();

            
        

}

}


