import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[3];
        int[] answer = new int [2];
        String inputString = br.readLine();
        String[] arr = inputString.split(" ");
        
        for (int i=0; i<arr.length; i++) {
            input[i] = Integer.parseInt(arr[i]);
        }
        answer[0] = (input[0]+input[1])%input[2];
        answer[1] = (input[0]*input[1])%input[2];

        for (int k=0;k<answer.length;k++) {
            System.out.println(answer[k]);
            System.out.println(answer[k]);
        }
    }
}
