import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int num = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<num;i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                int value = Integer.parseInt(st.nextToken());
                stack.push(value);
                continue;
            } else if (command.equals("pop")) {
                System.out.println(stack.empty() ? -1 : stack.pop());
                continue;
            } else if(command.equals("size")) {
                System.out.println(stack.size());
                continue;
            } else if(command.equals("empty")) {
                System.out.println(stack.empty() ? 1 : 0);
                continue;
            } else if(command.equals("top")) {
                System.out.println(stack.empty() ? -1 : stack.peek());
            }
        }
        br.close();
    }
}
