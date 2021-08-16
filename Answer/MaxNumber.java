
import java.util.Scanner;

public class MaxNumber {
    /**
     행, 열, 두 대각선 max
     5
     10 13 10 12 15
     12 39 30 23 11
     11 25 50 53 15
     19 27 29 37 27
     19 13 30 13 19
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] arr = new int[num][num];
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            int row = 0;
            int column = 0;
            for (int j=0;j<arr[i].length;j++) {
                row += arr[i][j];
                column += arr[j][i];
            }
            max = Math.max(max, row);
            max = Math.max(max, column);
        }
        int diagonal = 0;
        int reverseDiagonal = 0;
        for (int i=0;i< arr.length;i++) {
            diagonal += arr[i][i];
            reverseDiagonal += arr[i][arr.length - 1 - i];
        }
        max = Math.max(max, diagonal);
        max = Math.max(max, reverseDiagonal);

        System.out.print(max);
    }
}
