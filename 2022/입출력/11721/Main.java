
import java.util.Scanner;

public class Main {
    static void solution(String input) {
        for (int i=0;i<input.length() / 10 + 1;i++) {
            if (10 * (i + 1) <= input.length()) {
                System.out.println(input.substring(i * 10, 10 * (i + 1)));
            } else {
                System.out.println(input.substring(i * 10, (i * 10) + (input.length() % 10)));
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        solution(input);
    }
}

