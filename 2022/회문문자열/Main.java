import java.util.Scanner;

public class Main {
    /*
    * 7. 회문 문자열
    * gooG
     * */

    public static void solution(String input) {
        char[] inputArray = input.toCharArray();
        int r = input.length() - 1;
        int l = 0;

        while (l < r) {
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
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toLowerCase();
        solution(input);
    }
}
