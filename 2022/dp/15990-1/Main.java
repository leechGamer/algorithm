import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++) {
            System.out.println(solution(Integer.parseInt(br.readLine())));
        }
    }

    private static int solution(int n) {
        int[][] D = new int[n+1][4];
        D[0][1] = 0;
        D[0][2] = 0;
        D[0][3] = 0;

        for (int i=1;i<n+1;i++) {
            if (i < 1) {
                D[i][1] = 0;
            } else if (i == 1) {
                D[i][1] = 1;
            } else {
                D[i][1]= D[i-1][2] + D[i-1][3];
            }

            if (i < 2) {
                D[i][2] = 0;
            } else if (i == 2) {
                D[i][2] = 1;
            } else {
                D[i][2]= D[i-2][1] + D[i-2][3];
            }

            if (i < 3) {
                D[i][3] = 0;
            } else if (i == 3) {
                D[i][3] = 1;
            } else {
                D[i][3]= D[i-3][2] + D[i-3][1];
            }
        }
        return D[n][1] + D[n][2] + D[n][3];
    }
}
