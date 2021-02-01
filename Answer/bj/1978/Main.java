import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static boolean prime(int number)
    {
        if (number < 2){
            return false;
        }

        for (int i=2;i<=number/2;i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[s.nextInt()];
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            if (prime(s.nextInt()) == true) {
                count++;
            }
        }
        System.out.println(count);
    }
}
