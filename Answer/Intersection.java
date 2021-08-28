import java.util.Arrays;
import java.util.Scanner;

public class InterSectionV1 {
    /**
     공통원소 구하기
     5
     1 3 9 5 2
     5
     3 2 5 7 8
     */

    public static int[] solution(int[] A, int[] B) {
        return Arrays.stream(A)
                .distinct()
                .filter(x -> Arrays.stream(B).anyMatch(y -> y == x))
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i=0;i<n;i++) {
            A[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] B = new int[m];
        for (int i=0;i<m;i++) {
            B[i] = scanner.nextInt();
        }
        int[] answer = solution(A, B);

        for (int i=0;i<answer.length;i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
