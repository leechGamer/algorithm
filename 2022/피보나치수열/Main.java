
import java.util.Scanner;

public class Main {
    /*
     * 4. 피보나치 수열
     * 10
     *
     * */
    public static int fibonacci(int n) {
      if (n == 1 || n == 2) {
          return 1;
      } else {
          return fibonacci(n - 1) + fibonacci(n - 2);
      }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int answer = fibonacci(num);
        System.out.print(answer);
    }
}
