
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(s.readLine());
        PriorityQueue q = new PriorityQueue(Collections.reverseOrder());
        for (int i=0;i<N;i++) {
            Long x = Long.parseLong(s.readLine());
            if (x == 0) {
                if (q.isEmpty()) {
                    System.out.println(x);
                } else {
                    System.out.println(q.poll());
                }
            } else {
                q.add(x);
            }
        }
    }
}
