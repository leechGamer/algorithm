import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        long N = Long.parseLong(input[0]);
        long K = Long.parseLong(input[1]);
        List<Long> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            arr.add(Long.parseLong(st.nextToken()));
        }
        Collections.sort(arr);
        System.out.println(arr.get((int) K - 1));
    }
}
