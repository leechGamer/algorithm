import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int count = stringTokenizer.countTokens();
        String answer = stringTokenizer.nextToken();
        int max = answer.length();
        for (int i=0;i<count-1;i++) {
            String token = stringTokenizer.nextToken();
            if (token.length() > max) {
                answer = token;
                max = token.length();
            }
        }
        System.out.println(answer);
    }
}
