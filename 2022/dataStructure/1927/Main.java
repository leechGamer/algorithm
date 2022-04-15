
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Long> arr = new PriorityQueue<>();
        for (int i=0;i<N;i++) {
            long x = Long.parseLong(bufferedReader.readLine());
            if (x == 0) {
                if (arr.isEmpty()) {
                    System.out.println(x);
                    continue;
                }
                System.out.println(arr.poll());
            } else {
                arr.add(x);
            }
        }
    }
}

