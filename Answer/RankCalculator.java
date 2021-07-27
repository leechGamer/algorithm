import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RankCalculator {
    /**
     5
     87 89 92 100 76
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num];
        for (int i=0;i<num;i++) {
            arr[i] = scanner.nextInt();
        }

        int result[] = new int[num];
        for (int i=0;i<arr.length;i++) {
            int count = 1;
            for (int j=0;j<arr.length;j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
            result[i] = count;
        }

        for (int r: result) {
            System.out.print(r+ " ");
        }
    }
}
