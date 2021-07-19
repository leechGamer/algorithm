import java.util.Scanner;

public class Main {
    /*
     ksekkset
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = "";
        for (String i : input.split("")) {
            if (! result.contains(i)) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
