import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++) {
             array[i] = scanner.nextInt();
        }
        System.out.print(solution(array));
    }

    private static int solution(int[] array) {
        int total = 0;
        int extra = 0;
        for (int i=0;i<array.length;i++) {
            if (i == 0 &&  array[i] == 1) {
                extra = 1;
                total += extra;
                continue;
            }

            if (array[i] == 0) {
                extra = 0;
                continue;
            }

            if (array[i] == 1) {
                extra++;
                total += extra;
                continue;
            }
        }
        return total;
    }
}

