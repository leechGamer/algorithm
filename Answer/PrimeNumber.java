import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num+1];
        int count = 0;
        for (int i=2;i<arr.length;i++) {
            if (arr[i] == 1) {
                continue;
            } else {
                int n = 2;
                while (i*n < arr.length) {
                    arr[i*n] = 1;
                    n++;
                }
            }
        }

        for (int i=2;i<arr.length;i++) {
            if (arr[i] != 1) {
                count++;

            }
        }
        System.out.println(count);
    }
}
