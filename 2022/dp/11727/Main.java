import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(solution(N));
    }

    private static int solution(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        int[] dp = new int[1001];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 3;
        for (int i=3;i<N+1;i++) {
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }

        return dp[N];
    }
}
