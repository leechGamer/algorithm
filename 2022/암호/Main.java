import java.util.Scanner;

public class Main {
    /*
     * 12. 암호
     * 4
     * #****###**#####**#####**##**
     *
     * */
    public static void solution(String input) {
        int len = input.length();
        for (int i=0;i<len;i+=7) {
           char converted = (char) Integer.parseInt(input.substring(i, i + 7)
                   .replace("#", "1")
                   .replace("*", "0"),
                   2
           );
           System.out.print(converted);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String input = scanner.next();
        solution(input);
    }
}
