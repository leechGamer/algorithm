import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(solution(N));
    }

    private static int solution(int N) {
        if (N == 0) {
            return 0;
        }

        int[] dp = new int[1001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        if (N > 2) {
            for (int i = 3; i < N + 1; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
            }
        }

        return dp[N];
    }
}
