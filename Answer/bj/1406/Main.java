import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        
        String inputString = br.readLine();
        char[] stringArr = inputString.toCharArray();
        for (int i=0;i<stringArr.length;i++) {
            leftStack.push(stringArr[i]);
        }
        int count = Integer.parseInt(br.readLine());
        
        while (count-- > 0) {
            String command = br.readLine();
            if (command.charAt(0) == 'L') {
                if (leftStack.isEmpty() == false) {
                    rightStack.push(leftStack.pop());
                }
            } else if (command.charAt(0) == 'D') {
                if (rightStack.isEmpty() == false) {  
                    leftStack.push(rightStack.pop());
                }
        } else if (command.charAt(0) == 'B') {
            if (leftStack.isEmpty() == false) {
                leftStack.pop();
            }
                
        } else if (command.charAt(0) == 'P') {
            leftStack.push(command.charAt(2));
            }   
        }
        while(! leftStack.isEmpty()){
            rightStack.push(leftStack.pop());
        }
        while(! rightStack.isEmpty()){
            bw.write(rightStack.pop());
        }
        bw.flush();
        bw.close();
    }
}
