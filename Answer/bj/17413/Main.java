
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String inputString = br.readLine()+'\n';
        boolean flag = false;
        char[] charArray = inputString.toCharArray();
            for (int i=0;i<charArray.length;i++) {
                if (charArray[i] == '<') {
                    flag = true;
                    while (! stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(charArray[i]);
                } else if (charArray[i] == '>') {
                    flag = false;
                    sb.append(charArray[i]);
                    while (! stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                }
                else if (charArray[i] == ' ' || charArray[i] == '\n') {
                    while (! stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    System.out.print(sb+" ");
                    sb.setLength(0);
                    stack.clear();
                } else {
                    if (flag == false) {
                        stack.push(charArray[i]);
                    } else {
                        sb.append(charArray[i]);
                    }
                }
            }
        System.out.print(sb);

    }
}
