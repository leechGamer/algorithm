
import java.util.*;

public class Main {
    /**
     * 20
     * */

    public static void solution(boolean[] input) {
        input[0] = true;
        input[1] = true;
        int i = 2;
        int count = 2;
        while (i < input.length) {
            for (int j = 2; j * i < input.length; j++) {
                if (input[i * j]) {
                    continue;
                }
                input[i * j] = true;
                count++;
            }
            i++;
        }
        System.out.print(input.length - count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean[] input = new boolean[n+1];

        solution(input);
    }
}

