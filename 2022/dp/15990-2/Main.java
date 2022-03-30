import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static final long Mod = 1000000009L;
    static final int limit = 100000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] D = new long[limit+1][4];
        for (int i=1;i<limit+1;i++) {
            if (i > 1) {
                D[i][1]= (D[i-1][2] + D[i-1][3]) % Mod;
            } else if (i == 1) {
                D[i][1] = 1;
            } else {
                D[i][1] = 0;
            }

            if (i > 2) {
                D[i][2]= (D[i-2][1] + D[i-2][3]) % Mod;
            } else if (i == 2) {
                D[i][2] = 1;
            } else {
                D[i][2] = 0;
            }

            if (i > 3) {
                D[i][3]= (int) (D[i-3][2] + D[i-3][1]) % Mod;
            } else if (i == 3) {
                D[i][3] = 1;
            } else {
                D[i][3] = 0;
            }
        }
        for (int i=0;i<N;i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println((D[n][1] + D[n][2] + D[n][3]) % Mod);
        }
    }
}
