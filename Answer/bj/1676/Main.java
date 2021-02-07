import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int five = 5;
        int count = 0;        
        for (int i=1;i<=number;i++) {
            five = (int) Math.pow(5, i);
            if (five <= number) {
                count += number / five;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
