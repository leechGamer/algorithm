import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static long[] countZero(long num) {
        long twoCount = 0;
        long fiveCount = 0;
        long result[] = new long[2];
        if(num > 0) {
            for (long i = 5; i <= num; i *= 5) {
                fiveCount += num / i;
            }

            for (long j = 2; j <= num; j *= 2) {
                twoCount += num / j;
            }
            result[0] = twoCount;
            result[1] = fiveCount;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        long two = 0, five = 0;
        long n3 = n1 - n2;

        long[] n1Arr = countZero(n1);
        long[] n2Arr = countZero(n2);
        long[] n3Arr = countZero(n3);
        
        two = n1Arr[0] - n2Arr[0] - n3Arr[0];
        five = n1Arr[1] - n2Arr[1] - n3Arr[1];
    
        System.out.println(Math.min(two, five));
    }
}
