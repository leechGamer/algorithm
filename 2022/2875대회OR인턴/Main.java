import java.util.Scanner;

class Main {
    // 17744kb	208ms
    public static int solution(int N, int M, int K) {
        int result = 0;
        result = Math.min(N / 2, M);

        K -= N + M - (result * 3);

        while (K > 0) {
            result--;
            K -= 3;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int K = s.nextInt();

        System.out.print(solution(N, M, K));
    }
}
