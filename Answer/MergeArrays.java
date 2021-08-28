import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    /**
     3
     1 3 5
     5
     2 3 6 7 9
     */

    public static int[] solution(int[] A, int[] B) {
        Stream<Integer> streamA = Arrays.stream(A).boxed();
        Stream<Integer> streamB = Arrays.stream(B).boxed();

        Stream<Integer> streamC = Stream.concat(streamA, streamB).sorted();

        return streamC.mapToInt(x -> x).toArray();
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
