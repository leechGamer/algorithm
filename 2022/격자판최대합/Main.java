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
        ArrayList<Integer> list = new ArrayList<>();
        int value3 = 0;
        int value4 = 0;
        for (int i=0;i<input.length;i++) {
            int value1 = 0;
            int value2 = 0;
            for (int j=0;j<input.length;j++) {
                value1 += input[i][j];
                value2 += input[j][i];
                if (i == j) {
                    value3 += input[i][j];
                }
                if (i == 0) {
                    value4 += input[j][input.length - (i+1)];
                }
            }
            list.add(value1);
            list.add(value2);
        }
        list.add(value3);
        list.add(value4);
        list.sort(Comparator.reverseOrder());
        return list.get(0);
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
