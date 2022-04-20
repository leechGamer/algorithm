
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();
        long num = N;
        while (num > 1) {
            long i = 2;
            if (num % i != 0) {
                while (num % i != 0) {
                    i++;
                }
            }
            num = num / i;
            System.out.println(i);
        }
    }
}
