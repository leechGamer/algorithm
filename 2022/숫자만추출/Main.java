
import java.util.Scanner;

public class Main {
    /**
     * 9. 숫자만 추출
     * g0en2T0s8eSoft
     *
     */

    static void solution(String input) {
        String answer ="";
        char[] inputArray = input.toCharArray();
        for (int i=0;i<inputArray.length;i++) {
            if (Character.isDigit(inputArray[i])) {
                answer += inputArray[i];
            }
        }

        System.out.print(Integer.parseInt(answer));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        solution(input);
    }
}

