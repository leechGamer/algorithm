import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        long K = s.nextLong();

        Stack<Long> stack = new Stack<>();
        for (int i=0;i<K;i++) {
            long x = s.nextLong();
            if (x != 0) {
                stack.add(x);
            } else {
                stack.pop();
            }
        }
        System.out.println(stack.stream().mapToLong(Long::longValue).sum());
    }
}
