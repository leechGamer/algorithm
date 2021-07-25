
import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;
        for (int i=2;i<num;i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int a: arr) {
            System.out.print(a + " ");
        }
    }
}
