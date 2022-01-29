
import java.util.Scanner;

public class Main {
    /*
     * 2. 가위 바위 보
     * 5
     * 2 3 3 1 3
     * 1 1 2 2 3
     *
     * */
    public static char[] solution(int[] A, int[] B) {
        char[] answer = new char[A.length];
         for (int i=0;i<answer.length;i++) {
             if (A[i] == B[i]) {
                 answer[i] = 'D';
                 continue;
             }

             if (A[i] == 1 && B[i] == 3) {
                 answer[i] = 'A';
                 continue;
             } else if (A[i] == 2 && B[i] == 1) {
                 answer[i] = 'A';
                 continue;
             } else if (A[i] == 3 && B[i] == 2) {
                 answer[i] = 'A';
                 continue;
             }

             if (B[i] == 1 && A[i] == 3) {
                 answer[i] = 'B';
                 continue;
             } else if (B[i] == 2 && A[i] == 1) {
                 answer[i] = 'B';
                 continue;
             } else if (B[i] == 3 && A[i] == 2) {
                 answer[i] = 'B';
                 continue;
             }
         }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] A = new int[num];
        int[] B = new int[num];
        for (int i=0;i<num;i++) {
            A[i] = scanner.nextInt();
        }

        for (int i=0;i<num;i++) {
            B[i] = scanner.nextInt();
        }
        char[] answer = solution(A, B);
        for (int i=0;i<num;i++) {
            System.out.println(answer[i]);
        }
    }
}
