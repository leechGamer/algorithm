import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[][] D = new int[1001][10];
        for (int i=0;i<10;i++) {
            D[0][i] = 1;
        }

        for (int i=1;i<N;i++) {
            for (int j=0;j<10;j++) {
                int sum = 0;
                for (int k=j;k<10;k++) {
                     sum += D[i-1][k];
                }
                D[i][j] = sum % 10007;
            }
        }

        int result = 0;
        for (int x=0;x<10;x++) {
            result += D[N-1][x];
        }
        System.out.println(result % 10007);
    }
}
