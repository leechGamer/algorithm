import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0;
        char last = '0';
        char[] inputArray = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<inputArray.length;i++) {
            if (inputArray[i] == '(') {
                stack.push(inputArray[i]);
            } else if (inputArray[i] == ')' && last == '(') {
                stack.pop();
                count += stack.size();
            } else if (inputArray[i] == ')') {
                count += 1;
                stack.pop();
            }
            last = inputArray[i];
        }
        System.out.println(count);  
    }   
}
