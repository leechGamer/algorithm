import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(stringTokenizer.nextToken());
        for (int i=0;i<num;i++) {
            String input = br.readLine();
            char[] tmp = input.toCharArray();
            for (int j=tmp.length-1;j>-1;j--) {
                System.out.print(tmp[j]);
            }
            System.out.println();
        }
    }
}
