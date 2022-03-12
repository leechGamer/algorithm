import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        int[] dy = new int[n];
        dy[0] = 1;
        dy[1] = 2;
        for (int i=2;i<n;i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }
        return dy[n-1];
    }
}
