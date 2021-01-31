import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        Stack<Integer> stack = new Stack<>();
        String inputString = br.readLine();
        String[] inputStringArr = inputString.split(" ");
        int[]result = new int[count];
        for (int i=0;i<count;i++) {
            arr[i] = Integer.parseInt(inputStringArr[i]);
        }
        stack.push(0);
        for (int i=1;i<arr.length;i++) {
            while (! stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.peek()] = arr[i];
                stack.pop(); 
            }
            stack.push(i);          
        }
        while (!stack.isEmpty()) {
            result[stack.peek()] = -1;
            stack.pop();
        }

        for (int j=0;j<result.length;j++) {
            bw.write(result[j]+" ");
        }
        bw.flush();
    }
}
