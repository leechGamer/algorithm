import java.util.*;

public class Main {
    /**
     * 5
     * 5 3 7 2 3
     * 3 7 1 6 1
     * 7 2 5 3 4
     * 4 3 6 4 1
     * 8 7 3 5 2
     */


    public static int solution(int[][] input) {
        int count =0;
        for (int i=0;i<input.length;i++) {
            for (int j=0;j<input.length;j++) {
                int up = 0;
                int down = 0;
                int left = 0;
                int right = 0;
                int current = input[i][j];
                if (i-1 >= 0) {
                    up = input[i-1][j];
                }

                if (i+1 < input.length) {
                    down = input[i+1][j];
                }

                if (j-1 >= 0) {
                    left = input[i][j-1];
                }

                if (j+1 < input.length) {
                    right = input[i][j+1];
                }

                if (up < current
                        && down < current
                        && left < current
                        && right < current
                ) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] input = new int[n][n];
        for (int i=0;i<input.length;i++) {
            for (int j=0;j<input[i].length;j++) {
                input[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(input));
    }
}

