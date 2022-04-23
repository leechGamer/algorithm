
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] had = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++) {
            had[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(had);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean find = false;
        for (int i=0;i<M;i++) {
            int left = 0;
            int right = N - 1;
            find = false;
            int number= Integer.parseInt(st.nextToken());
            while (left <= right) {
                int mid = (left + right) / 2;
                int midNumber = had[mid];
                if (number < midNumber) {
                    right = mid;
                    right--;
                } else if (number > midNumber) {
                    left = mid;
                    left++;
                } else {
                    find = true;
                    break;
                }
            }
            if (!find) {
                sb.append(0 + " ");
            } else {
                sb.append(1 + " ");
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
