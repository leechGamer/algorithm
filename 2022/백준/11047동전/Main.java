import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    // 14248kb	128ms
    public static int solution(int[] input, int total) {
        int count = 0;
        for (int i=input.length-1;i>-1;i--) {
            int money = input[i];
            if (money > total) {
                continue;
            }

            if (total - money < 0) {
                continue;
            } else {
                count += total / money;
                total = total % money;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int num = Integer.parseInt(stringTokenizer.nextToken());
        int total = Integer.parseInt(stringTokenizer.nextToken());
        int[] input = new int[num];
        for (int i=0;i<num;i++) {
            input[i] = (Integer.parseInt(String.valueOf(bufferedReader.readLine())));
        }
        bufferedReader.close();
        System.out.print(solution(input, total));
    }
}
