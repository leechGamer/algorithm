import java.util.Scanner;

public class Score {
    /**
     10
     1 0 1 1 1 0 0 1 1 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        int total = 0;
        int count = 0;
        for (int i=0;i<num;i++) {
            arr[i] = scanner.nextInt();
        }

        for (int a : arr) {
            if (a == 1) {
                count++;
            } else {
                count = 0;
            }
            total += count;
        }
        System.out.print(total);
    }
}
