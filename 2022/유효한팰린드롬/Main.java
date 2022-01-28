
import java.util.Scanner;

public class Main {
    /**
     * 8. 유효한 팰린드롬
     * found7, time: study; Yduts; emit, 7Dnuof
     *
     */

    static void solution(String input) {
        char[] inputArray = input.toLowerCase().replaceAll("\\p{Z}", "").toCharArray();
        int l = 0;
        int r = inputArray.length - 1;
        while (l < r) {
            if (!Character.isAlphabetic(inputArray[l])) {
                l++;
                continue;
            }

            if (!Character.isAlphabetic(inputArray[r])) {
                r--;
                continue;
            }

            if (inputArray[l] != inputArray[r]) {
                System.out.print("NO");
                return;
            }
            l++;
            r--;
        }
        System.out.print("YES");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        solution(input);
    }
}

