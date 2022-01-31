
import java.util.*;

public class Main {
    static void isPrime(int number) {
        boolean[] isPrime = new boolean[number+1];
        isPrime[0] = true;
        isPrime[1] = true;
        for (int i=2;i<isPrime.length;i++) {
            for (int j=2;i*j<isPrime.length;j++) {
                isPrime[i*j] = true;
            }
        }

        if (!isPrime[number]) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0;i<n;i++) {
            String num = scanner.next();
            char[] array = num.toCharArray();
            String tmp = "";
            for (int j= array.length-1;j>-1;j--) {
                tmp += array[j];
            }
            int reversed = Integer.parseInt(tmp);
            isPrime(reversed);
        }
    }
}

