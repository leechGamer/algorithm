import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        for (int i=0;i<len;i++) {
            int N = s.nextInt();
            System.out.println(solution(N));
        }
    }

    private static int solution(int N) {
        if (N == 1) {
            return 1;
        }
        int[] dp = new int[12];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3;i<N+1;i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[N];
    }
}
