import java.util.*;

public class Main {
    /**
     * 5
     * 87 89 92 100 76
     * */

    public static void solution(int[] input) {
        for (int i=0;i< input.length;i++) {
            int count = 0;
            int duplicated = 0;
            for (int j=0;j< input.length;j++) {
                if (i != j) {
                    if (input[i] > input[j]) {
                        count++;
                    } else if (input[i] == input[j]) {
                        duplicated++;
                    }
                }
            }
            if (duplicated > 0) {
                System.out.print(input.length - duplicated - count + " ");
                continue;
            }
            System.out.print(input.length - count + " ");

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] input = new int[n];
        for (int i=0;i<n;i++) {
            input[i] = scanner.nextInt();
        }
        solution(input);
    }
}

