import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[][] D = new long[91][2];
        D[0][0] = 0;
        D[0][1] = 1;

        for (int i=1;i<D.length;i++) {
            D[i][0] = D[i-1][0] + D[i-1][1];
            D[i][1] = D[i-1][0];
        }

        System.out.println(D[N-1][0] + D[N-1][1]);
    }
}
