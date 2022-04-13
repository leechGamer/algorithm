import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] G = new int[n][2];
        for (int i=0;i<n;i++) {
            G[i][0] = s.nextInt();
            G[i][1] = s.nextInt();
        }
        Arrays.sort(G, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for (int i=0;i<n;i++) {
            System.out.println(G[i][0] + " " + G[i][1]);
        }
    }
}

