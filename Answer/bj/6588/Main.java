
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.InputStreamReader;

// 골드바흐의 추측
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int MAX = 1000000;
        boolean[] check = new boolean[MAX + 1];
        ArrayList<Integer> prime = new ArrayList();
        check[0] = check[1] = true;
        for (int i = 2; i*i <= MAX; i++) {
            if (check[i] == false) {
                prime.add(i);
                for (int j = i + i; j <= MAX; j += i) {
                    check[j] = true;
                }
            }
        }

        while (true) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                break;
            }
            
            for (int i = 1; i < prime.size(); i++) {
                int p = prime.get(i);
                int index = number - p;
                if (check[index] == false) {
                    bw.write(number + " = " + p + " + " + index);
                    bw.newLine();
                    bw.flush();
                    break;
                }
            }
        }
        bw.close();
    }
}
