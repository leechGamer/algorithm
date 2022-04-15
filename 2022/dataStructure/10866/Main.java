
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(s.readLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<N;i++) {
            String[] splitted = s.readLine().split("\\s+");
            String command = splitted[0];
            int number = -10;
            if (splitted.length > 1) {
                number = Integer.parseInt(splitted[1]);
            }
            switch (command) {
                case "push_front": {
                    deque.addFirst(number);
                    break;
                } case "push_back": {
                    deque.addLast(number);
                    break;
                } case "pop_front": {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.pollFirst()).append("\n");
                    }
                    break;
                } case "pop_back": {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.pollLast()).append("\n");
                    }
                    break;
                } case "size": {
                    sb.append(deque.size()).append("\n");
                    break;
                } case "empty": {
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                } case "front": {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.getFirst()).append("\n");
                    }
                    break;
                } case "back": {
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.getLast()).append("\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
