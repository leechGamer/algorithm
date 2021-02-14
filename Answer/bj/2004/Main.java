import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int countZero(int num) {
        int count = 0;
        for (int i=1;i<=num;i++) {
            count +=  num / (int) Math.pow(5, i);
        }
        return count;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputArr = input.split(" ");
        int n1 = Integer.parseInt(inputArr[0]);
        int n2 = Integer.parseInt(inputArr[1]);
        int n3 = n1 - n2;
        
        int result = countZero(n1) - countZero(n2) - countZero(n3);
        System.out.println(result);
    }
}
