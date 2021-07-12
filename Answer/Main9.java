import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        List<String> list = new ArrayList<>();
        for (int i=0;i<input.length();i++) {
            if (Character.isDigit(input.charAt(i))) {
                list.add(String.valueOf(input.charAt(i)));
            }
        }

        String result = "";
        for (String i : list) {
            result += i;
        }

        System.out.println(Integer.parseInt(result));
    }
}
