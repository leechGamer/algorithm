import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] p = new int[N+1];
        for (int i=1;i<N+1;i++) {
            p[i] = s.nextInt();
        }
        solution(p);
    }

    private static void solution(int[] p) {
        int[] dp = new int[p.length + 1];
        for (int i=1;i<p.length;i++) {
            for (int j=1;j<=i;j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + p[j]);
            }
        }
        System.out.println(dp[p.length-1]);
    }
}
