import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        int[] dy = new int[n + 2];
        if (n == 0 || n == 1) {
            return 0;
        }
        dy[1] = 0;
        dy[2] = 1;
        dy[3] = 1;
        for (int i=4;i<n+1;i++) {
            int a = 100000;
            int b = 100000;
            int c = 100000;

            if (i % 3 == 0) {
                if (i / 3 < i) {
                    a = dy[3] + dy[i / 3];
                }
            }
            if (i % 2 == 0) {
                if (i / 2 < i) {
                    b = dy[2] + dy[i / 2];
                }
            }

            c = 1 + dy[i - 1];

            dy[i] = Math.min(Math.min(a, b),c);
        }

        return dy[n];
    }
}

