import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int M = s.nextInt();
        int N = s.nextInt();

        boolean[] prime = new boolean[N+1];
        prime[0] = true;
        prime[1] = true;

        for (int i=2;i<=N;i++) {
            int j = 2;
            while (i * j <= N) {
                if (!prime[i * j] && i * j >= M) {
                    prime[i * j] = true;
                }
                j++;
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i=M;i<=N;i++) {
            if (!prime[i]) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        }else {
            System.out.println(-1);
        }
    }
}
